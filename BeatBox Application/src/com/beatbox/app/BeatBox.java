package com.beatbox.app;

import static javax.sound.midi.ShortMessage.*;

import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.*;

import javax.sound.midi.*;
import javax.swing.*;
import javax.swing.event.*;

public class BeatBox {

	private JList<String> incomingList;
	private JTextArea userMessage;
	private ArrayList<JCheckBox> checkboxList;
	
	private Vector<String> listVector = new Vector<> ();
	private HashMap<String, boolean[]> otherSeqsMap = new HashMap<> ();
	
	private String userName;
	private int nextNum;
	
	private ObjectOutputStream out;
	private ObjectInputStream in;
	
	private Sequencer sequencer;
	private Sequence sequence;
	private Track track;
	
	String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat",
			"Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap",
			"High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga",
			"Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo",
			"Open Hi Conga"};
	
	int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

	public void startUp(String name) {
		userName = name;
		// open connection server
		
		try (Socket socket = new Socket("127.0.0.1", 5000)) {
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
			ExecutorService executor = Executors.newSingleThreadExecutor();
			executor.submit(new RemoteReader());
			
		} catch (Exception e) {
			System.out.println("Couldn't connect-you'II have to play alone");
		}
		setUpMidi();
		buildUpGui();
	}

	private void buildUpGui() {
		JFrame frame = new JFrame("BeatBox App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel background = new JPanel();
		background.setBorder(BorderFactory.createEmptyBorder(10, 10 ,10, 10));
		
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		JButton start = new JButton("Start");
		start.addActionListener( e -> buildStartAndTrack());
		buttonBox.add(start);
		
		JButton stop = new JButton("Stop");
		stop.addActionListener(e -> sequencer.stop());
		buttonBox.add(stop);
		
		JButton tempoUp = new JButton("Tempo Up");
		tempoUp.addActionListener(e -> changeTempo(1.03f));
		buttonBox.add(tempoUp);
		
		JButton tempoDown = new JButton("Tempo Down");
		tempoDown.addActionListener(e -> changeTempo(0.97f));
		buttonBox.add(tempoDown);
		
		JButton sendIt = new JButton("Send It");
		sendIt.addActionListener(e -> sendMessageAndTracks());
		buttonBox.add(sendIt);
		
		userMessage = new JTextArea();
		userMessage.setLineWrap(true);
		userMessage.setWrapStyleWord(true);
		JScrollPane messageScroller = new JScrollPane(userMessage);
		buttonBox.add(messageScroller);
		
		incomingList = new JList<> ();
		incomingList.addListSelectionListener(new MyListSelectionListener());
		incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane theList = new JScrollPane(incomingList);
		buttonBox.add(theList);
		incomingList.setListData(listVector);
		
		Box nameBox = new Box(BoxLayout.Y_AXIS);
		for(String instrumentName : instrumentNames) {
			JLabel instrumentLabel = new JLabel(instrumentName);
			instrumentLabel.setBorder(BorderFactory.createEmptyBorder(4, 1, 4, 1));
			nameBox.add(instrumentLabel);
		}
			background.add(BorderLayout.WEST, nameBox);
			
			frame.getContentPane().add(background);
			GridLayout grid = new GridLayout(16, 16);
			grid.setVgap(1);
			grid.setHgap(2);
			JPanel mainPanel = new JPanel(grid);
			background.add(BorderLayout.CENTER, mainPanel);
			background.add(BorderLayout.EAST, buttonBox);
			
			checkboxList = new ArrayList<> ();
			for(int i=0; i<256; i++) {
				JCheckBox c = new JCheckBox();
				c.setSelected(false);
				checkboxList.add(c);
				mainPanel.add(c);
			}
			
			frame.setBounds(50 ,50, 600, 600);
			frame.setVisible(true);
	}
	
	private void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(120);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	private void buildStartAndTrack() {
		ArrayList <Integer> trackList;
		sequence.deleteTrack(track);
		track = sequence.createTrack();
		for(int i=0; i<16; i++) {
			trackList = new ArrayList<> ();
			int key = instruments[i];
			for(int j=0; j<16; j++) {
				JCheckBox jc = checkboxList.get(j +(16 * i));
				if(jc.isSelected()) {
					trackList.add(key);
				} else {
					trackList.add(null);
				}
			}
		makeTracks(trackList);
		track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, 16));
		}
		track.add(makeEvent(PROGRAM_CHANGE, 9, 1, 0, 15));
		try {
			sequencer.setSequence(sequence);
			sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
			sequencer.setTempoInBPM(120);
			sequencer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void changeTempo(float tempoMultiplier) {
		float tempoFactor= sequencer.getTempoFactor();
		sequencer.setTempoFactor(tempoFactor * tempoMultiplier);
	}
	
	private void sendMessageAndTracks() {
		boolean[] checkboxState = new boolean[256];
		for(int i=0; i<256; i++) {
			JCheckBox check = checkboxList.get(i);
			if(check.isSelected()) {
				checkboxState[i] = true;
			}
		}
		
		try {
			out.writeObject(userName+ nextNum++ +": "+userMessage.getText());
			out.writeObject(checkboxState);
		} catch (IOException e) {
			System.out.println("Terribly sorry. could not send it to the server.");
			e.printStackTrace();
		}
		userMessage.setText(" ");
	}
	
	public class MyListSelectionListener implements ListSelectionListener {
		@Override
		public void valueChanged(ListSelectionEvent e) {
			if(!e.getValueIsAdjusting()) {
				String selected = incomingList.getSelectedValue();
				if(selected != null) {
					boolean[] selectedState = otherSeqsMap.get(selected);
					changeSequence(selectedState);
					sequencer.stop();
					buildStartAndTrack();
				}
			}
		}
	}

		private void changeSequence(boolean[] checkboxState) {
			for(int i=0; i<256; i++) {
				JCheckBox check = checkboxList.get(i);
				check.setSelected(checkboxState[i]);
			}
		}
		
		public void makeTracks(ArrayList<Integer> list) {
			for(int i=0; i<list.size(); i++) {
				Integer instrumentKey = list.get(i);
				
				if(instrumentKey != null) {
					track.add(makeEvent(NOTE_ON, 9, instrumentKey, 100, i));
					track.add(makeEvent(NOTE_OFF, 9, instrumentKey, 100, i+1));
				}
			}
		}
		
		public static MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick) {
			MidiEvent event = null;
			try {
				ShortMessage msg = new ShortMessage();
				msg.setMessage(cmd, chnl, one, two);
				event = new MidiEvent(msg, tick);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return event;
		}
		
		public class RemoteReader implements Runnable {

			@Override
			public void run() {
				try {
					Object obj;
					while ((obj = in.readObject()) != null) {
						System.out.println("got a connection from a server");
						System.out.println(obj.getClass());
						
						String nameToShow = (String) obj;
						boolean[] checkboxState = (boolean[]) in.readObject();
						otherSeqsMap.put(nameToShow, checkboxState);
						
						listVector.add(nameToShow);
						incomingList.setListData(listVector);
					}
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	
}
