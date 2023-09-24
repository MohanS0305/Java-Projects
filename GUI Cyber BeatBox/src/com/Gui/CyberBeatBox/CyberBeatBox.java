package com.Gui.CyberBeatBox;

import javax.swing.*;
import java.awt.*;

public class CyberBeatBox {
	private JFrame frame;
	private JPanel leftPanel;
	private JPanel centerPanel;
	private JPanel rightPanel;
	
	public void setUpGui() {
		// create frame and panels
		 frame = new JFrame("Cyber Beat Box");
		 leftPanel = new JPanel();
		centerPanel = new JPanel();
		 rightPanel = new JPanel();
	}
	
	public void start() {
		setUpGui();
		// insert the panel into the frame
		frame.getContentPane().add(BorderLayout.WEST, leftPanel);
		frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
		frame.getContentPane().add(BorderLayout.EAST, rightPanel);
		
		/* change the first panel and third panel to boxLayout */
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		
		/* insert the components into the leftPanel */
		// create label for left side panel
		JLabel label1 = new JLabel("Bass Drum");
		JLabel label2 = new JLabel("Closed Hi-Hat");
		JLabel label3 = new JLabel("Open Hi-Hat");
		JLabel label4 = new JLabel("Acoustic Snare");
		JLabel label5 = new JLabel("Crash Cymbal");
		JLabel label6 = new JLabel("Hand Clap");
		JLabel label7 = new JLabel("Hight Tom");
		JLabel label8 = new JLabel("Hi Bongo");
		JLabel label9 = new JLabel("Maracas");
		JLabel label10 = new JLabel("Whistle");
		JLabel label11 = new JLabel("Low Conga");
		JLabel label12 = new JLabel("Cowbell");
		JLabel label13 = new JLabel("Vibraslap");
		JLabel label14 = new JLabel("Low-mid Tom");
		JLabel label15 = new JLabel("High Agogo");
		JLabel label16 = new JLabel("Open HI Conga");
		leftPanel.add(label1);
		leftPanel.add(label2);
		leftPanel.add(label3);
		leftPanel.add(label4);
		leftPanel.add(label5);
		leftPanel.add(label6);
		leftPanel.add(label7);
		leftPanel.add(label8);
		leftPanel.add(label9);
		leftPanel.add(label10);
		leftPanel.add(label11);
		leftPanel.add(label12);
		leftPanel.add(label13);
		leftPanel.add(label14);
		leftPanel.add(label15);
		leftPanel.add(label16);
		
		// change the leftPanel font to bold
		Font font1 = new Font("serif", Font.BOLD, 19);
		label1.setFont(font1);
		label2.setFont(font1);
		label3.setFont(font1);
		label4.setFont(font1);
		label5.setFont(font1);
		label6.setFont(font1);
		label7.setFont(font1);
		label8.setFont(font1);
		label9.setFont(font1);
		label10.setFont(font1);
		label11.setFont(font1);
		label12.setFont(font1);
		label13.setFont(font1);
		label14.setFont(font1);
		label15.setFont(font1);
		label16.setFont(font1);
		/* ------- leftPanel over ------------ */
		
		/* insert the components into the centerPanel */
		// create first row checkBox
		JCheckBox checkBoxRow1_1 = new JCheckBox();
		JCheckBox checkBoxRow1_2 = new JCheckBox();
		JCheckBox checkBoxRow1_3 = new JCheckBox();
		JCheckBox checkBoxRow1_4 = new JCheckBox();
		JCheckBox checkBoxRow1_5 = new JCheckBox();
		JCheckBox checkBoxRow1_6 = new JCheckBox();
		JCheckBox checkBoxRow1_7 = new JCheckBox();
		JCheckBox checkBoxRow1_8 = new JCheckBox();
		JCheckBox checkBoxRow1_9 = new JCheckBox();
		JCheckBox checkBoxRow1_10 = new JCheckBox();
		JCheckBox checkBoxRow1_11 = new JCheckBox();
		JCheckBox checkBoxRow1_12 = new JCheckBox();
		JCheckBox checkBoxRow1_13 = new JCheckBox();
		JCheckBox checkBoxRow1_14 = new JCheckBox();
		JCheckBox checkBoxRow1_15 = new JCheckBox();
		JCheckBox checkBoxRow1_16 = new JCheckBox();

		// create second row checkBox
		JCheckBox checkBoxRow2_1 = new JCheckBox();
		JCheckBox checkBoxRow2_2 = new JCheckBox();
		JCheckBox checkBoxRow2_3 = new JCheckBox();
		JCheckBox checkBoxRow2_4 = new JCheckBox();
		JCheckBox checkBoxRow2_5 = new JCheckBox();
		JCheckBox checkBoxRow2_6 = new JCheckBox();
		JCheckBox checkBoxRow2_7 = new JCheckBox();
		JCheckBox checkBoxRow2_8 = new JCheckBox();
		JCheckBox checkBoxRow2_9 = new JCheckBox();
		JCheckBox checkBoxRow2_10 = new JCheckBox();
		JCheckBox checkBoxRow2_11 = new JCheckBox();
		JCheckBox checkBoxRow2_12 = new JCheckBox();
		JCheckBox checkBoxRow2_13 = new JCheckBox();
		JCheckBox checkBoxRow2_14 = new JCheckBox();
		JCheckBox checkBoxRow2_15 = new JCheckBox();
		JCheckBox checkBoxRow2_16 = new JCheckBox();		
	
		// create third row checkBox
		JCheckBox checkBoxRow3_1 = new JCheckBox();
		JCheckBox checkBoxRow3_2 = new JCheckBox();
		JCheckBox checkBoxRow3_3 = new JCheckBox();
		JCheckBox checkBoxRow3_4 = new JCheckBox();
		JCheckBox checkBoxRow3_5 = new JCheckBox();
		JCheckBox checkBoxRow3_6 = new JCheckBox();
		JCheckBox checkBoxRow3_7 = new JCheckBox();
		JCheckBox checkBoxRow3_8 = new JCheckBox();
		JCheckBox checkBoxRow3_9 = new JCheckBox();
		JCheckBox checkBoxRow3_10 = new JCheckBox();
		JCheckBox checkBoxRow3_11 = new JCheckBox();
		JCheckBox checkBoxRow3_12 = new JCheckBox();
		JCheckBox checkBoxRow3_13 = new JCheckBox();
		JCheckBox checkBoxRow3_14 = new JCheckBox();
		JCheckBox checkBoxRow3_15 = new JCheckBox();
		JCheckBox checkBoxRow3_16 = new JCheckBox();	
		
		// create fourth row checkBox
		JCheckBox checkBoxRow4_1 = new JCheckBox();
		JCheckBox checkBoxRow4_2 = new JCheckBox();
		JCheckBox checkBoxRow4_3 = new JCheckBox();
		JCheckBox checkBoxRow4_4 = new JCheckBox();
		JCheckBox checkBoxRow4_5 = new JCheckBox();
		JCheckBox checkBoxRow4_6 = new JCheckBox();
		JCheckBox checkBoxRow4_7 = new JCheckBox();
		JCheckBox checkBoxRow4_8 = new JCheckBox();
		JCheckBox checkBoxRow4_9 = new JCheckBox();
		JCheckBox checkBoxRow4_10 = new JCheckBox();
		JCheckBox checkBoxRow4_11 = new JCheckBox();
		JCheckBox checkBoxRow4_12 = new JCheckBox();
		JCheckBox checkBoxRow4_13 = new JCheckBox();
		JCheckBox checkBoxRow4_14 = new JCheckBox();
		JCheckBox checkBoxRow4_15 = new JCheckBox();
		JCheckBox checkBoxRow4_16 = new JCheckBox();
		
		// create fifth row checkBox
		JCheckBox checkBoxRow5_1 = new JCheckBox();
		JCheckBox checkBoxRow5_2 = new JCheckBox();
		JCheckBox checkBoxRow5_3 = new JCheckBox();
		JCheckBox checkBoxRow5_4 = new JCheckBox();
		JCheckBox checkBoxRow5_5 = new JCheckBox();
		JCheckBox checkBoxRow5_6 = new JCheckBox();
		JCheckBox checkBoxRow5_7 = new JCheckBox();
		JCheckBox checkBoxRow5_8 = new JCheckBox();
		JCheckBox checkBoxRow5_9 = new JCheckBox();
		JCheckBox checkBoxRow5_10 = new JCheckBox();
		JCheckBox checkBoxRow5_11 = new JCheckBox();
		JCheckBox checkBoxRow5_12 = new JCheckBox();
		JCheckBox checkBoxRow5_13 = new JCheckBox();
		JCheckBox checkBoxRow5_14 = new JCheckBox();
		JCheckBox checkBoxRow5_15 = new JCheckBox();
		JCheckBox checkBoxRow5_16 = new JCheckBox();
		
		// create sixth row checkBox
		JCheckBox checkBoxRow6_1 = new JCheckBox();
		JCheckBox checkBoxRow6_2 = new JCheckBox();
		JCheckBox checkBoxRow6_3 = new JCheckBox();
		JCheckBox checkBoxRow6_4 = new JCheckBox();
		JCheckBox checkBoxRow6_5 = new JCheckBox();
		JCheckBox checkBoxRow6_6 = new JCheckBox();
		JCheckBox checkBoxRow6_7 = new JCheckBox();
		JCheckBox checkBoxRow6_8 = new JCheckBox();
		JCheckBox checkBoxRow6_9 = new JCheckBox();
		JCheckBox checkBoxRow6_10 = new JCheckBox();
		JCheckBox checkBoxRow6_11 = new JCheckBox();
		JCheckBox checkBoxRow6_12 = new JCheckBox();
		JCheckBox checkBoxRow6_13 = new JCheckBox();
		JCheckBox checkBoxRow6_14 = new JCheckBox();
		JCheckBox checkBoxRow6_15 = new JCheckBox();
		JCheckBox checkBoxRow6_16 = new JCheckBox();
		
		// create seventh row checkBox
		JCheckBox checkBoxRow7_1 = new JCheckBox();
		JCheckBox checkBoxRow7_2 = new JCheckBox();
		JCheckBox checkBoxRow7_3 = new JCheckBox();
		JCheckBox checkBoxRow7_4 = new JCheckBox();
		JCheckBox checkBoxRow7_5 = new JCheckBox();
		JCheckBox checkBoxRow7_6 = new JCheckBox();
		JCheckBox checkBoxRow7_7 = new JCheckBox();
		JCheckBox checkBoxRow7_8 = new JCheckBox();
		JCheckBox checkBoxRow7_9 = new JCheckBox();
		JCheckBox checkBoxRow7_10 = new JCheckBox();
		JCheckBox checkBoxRow7_11 = new JCheckBox();
		JCheckBox checkBoxRow7_12 = new JCheckBox();
		JCheckBox checkBoxRow7_13 = new JCheckBox();
		JCheckBox checkBoxRow7_14 = new JCheckBox();
		JCheckBox checkBoxRow7_15 = new JCheckBox();
		JCheckBox checkBoxRow7_16 = new JCheckBox();
		
		// create seventh row checkBox
		JCheckBox checkBoxRow8_1 = new JCheckBox();
		JCheckBox checkBoxRow8_2 = new JCheckBox();
		JCheckBox checkBoxRow8_3 = new JCheckBox();
		JCheckBox checkBoxRow8_4 = new JCheckBox();
		JCheckBox checkBoxRow8_5 = new JCheckBox();
		JCheckBox checkBoxRow8_6 = new JCheckBox();
		JCheckBox checkBoxRow8_7 = new JCheckBox();
		JCheckBox checkBoxRow8_8 = new JCheckBox();
		JCheckBox checkBoxRow8_9 = new JCheckBox();
		JCheckBox checkBoxRow8_10 = new JCheckBox();
		JCheckBox checkBoxRow8_11 = new JCheckBox();
		JCheckBox checkBoxRow8_12 = new JCheckBox();
		JCheckBox checkBoxRow8_13 = new JCheckBox();
		JCheckBox checkBoxRow8_14 = new JCheckBox();
		JCheckBox checkBoxRow8_15 = new JCheckBox();
		JCheckBox checkBoxRow8_16 = new JCheckBox();
		
		// create ninth row checkBox
		JCheckBox checkBoxRow9_1 = new JCheckBox();
		JCheckBox checkBoxRow9_2 = new JCheckBox();
		JCheckBox checkBoxRow9_3 = new JCheckBox();
		JCheckBox checkBoxRow9_4 = new JCheckBox();
		JCheckBox checkBoxRow9_5 = new JCheckBox();
		JCheckBox checkBoxRow9_6 = new JCheckBox();
		JCheckBox checkBoxRow9_7 = new JCheckBox();
		JCheckBox checkBoxRow9_8 = new JCheckBox();
		JCheckBox checkBoxRow9_9 = new JCheckBox();
		JCheckBox checkBoxRow9_10 = new JCheckBox();
		JCheckBox checkBoxRow9_11 = new JCheckBox();
		JCheckBox checkBoxRow9_12 = new JCheckBox();
		JCheckBox checkBoxRow9_13 = new JCheckBox();
		JCheckBox checkBoxRow9_14 = new JCheckBox();
		JCheckBox checkBoxRow9_15 = new JCheckBox();
		JCheckBox checkBoxRow9_16 = new JCheckBox();
		
		// create tenth row checkBox
		JCheckBox checkBoxRow10_1 = new JCheckBox();
		JCheckBox checkBoxRow10_2 = new JCheckBox();
		JCheckBox checkBoxRow10_3 = new JCheckBox();
		JCheckBox checkBoxRow10_4 = new JCheckBox();
		JCheckBox checkBoxRow10_5 = new JCheckBox();
		JCheckBox checkBoxRow10_6 = new JCheckBox();
		JCheckBox checkBoxRow10_7 = new JCheckBox();
		JCheckBox checkBoxRow10_8 = new JCheckBox();
		JCheckBox checkBoxRow10_9 = new JCheckBox();
		JCheckBox checkBoxRow10_10 = new JCheckBox();
		JCheckBox checkBoxRow10_11 = new JCheckBox();
		JCheckBox checkBoxRow10_12 = new JCheckBox();
		JCheckBox checkBoxRow10_13 = new JCheckBox();
		JCheckBox checkBoxRow10_14 = new JCheckBox();
		JCheckBox checkBoxRow10_15 = new JCheckBox();
		JCheckBox checkBoxRow10_16 = new JCheckBox();
		
		// create eleven row checkBox
		JCheckBox checkBoxRow11_1 = new JCheckBox();
		JCheckBox checkBoxRow11_2 = new JCheckBox();
		JCheckBox checkBoxRow11_3 = new JCheckBox();
		JCheckBox checkBoxRow11_4 = new JCheckBox();
		JCheckBox checkBoxRow11_5 = new JCheckBox();
		JCheckBox checkBoxRow11_6 = new JCheckBox();
		JCheckBox checkBoxRow11_7 = new JCheckBox();
		JCheckBox checkBoxRow11_8 = new JCheckBox();
		JCheckBox checkBoxRow11_9 = new JCheckBox();
		JCheckBox checkBoxRow11_10 = new JCheckBox();
		JCheckBox checkBoxRow11_11 = new JCheckBox();
		JCheckBox checkBoxRow11_12 = new JCheckBox();
		JCheckBox checkBoxRow11_13 = new JCheckBox();
		JCheckBox checkBoxRow11_14 = new JCheckBox();
		JCheckBox checkBoxRow11_15 = new JCheckBox();
		JCheckBox checkBoxRow11_16 = new JCheckBox();
		
		// create twelfth row checkBox
		JCheckBox checkBoxRow12_1 = new JCheckBox();
		JCheckBox checkBoxRow12_2 = new JCheckBox();
		JCheckBox checkBoxRow12_3 = new JCheckBox();
		JCheckBox checkBoxRow12_4 = new JCheckBox();
		JCheckBox checkBoxRow12_5 = new JCheckBox();
		JCheckBox checkBoxRow12_6 = new JCheckBox();
		JCheckBox checkBoxRow12_7 = new JCheckBox();
		JCheckBox checkBoxRow12_8 = new JCheckBox();
		JCheckBox checkBoxRow12_9 = new JCheckBox();
		JCheckBox checkBoxRow12_10 = new JCheckBox();
		JCheckBox checkBoxRow12_11 = new JCheckBox();
		JCheckBox checkBoxRow12_12 = new JCheckBox();
		JCheckBox checkBoxRow12_13 = new JCheckBox();
		JCheckBox checkBoxRow12_14 = new JCheckBox();
		JCheckBox checkBoxRow12_15 = new JCheckBox();
		JCheckBox checkBoxRow12_16 = new JCheckBox();
		
		// create thirteenth row checkBox
		JCheckBox checkBoxRow13_1 = new JCheckBox();
		JCheckBox checkBoxRow13_2 = new JCheckBox();
		JCheckBox checkBoxRow13_3 = new JCheckBox();
		JCheckBox checkBoxRow13_4 = new JCheckBox();
		JCheckBox checkBoxRow13_5 = new JCheckBox();
		JCheckBox checkBoxRow13_6 = new JCheckBox();
		JCheckBox checkBoxRow13_7 = new JCheckBox();
		JCheckBox checkBoxRow13_8 = new JCheckBox();
		JCheckBox checkBoxRow13_9 = new JCheckBox();
		JCheckBox checkBoxRow13_10 = new JCheckBox();
		JCheckBox checkBoxRow13_11 = new JCheckBox();
		JCheckBox checkBoxRow13_12 = new JCheckBox();
		JCheckBox checkBoxRow13_13 = new JCheckBox();
		JCheckBox checkBoxRow13_14 = new JCheckBox();
		JCheckBox checkBoxRow13_15 = new JCheckBox();
		JCheckBox checkBoxRow13_16 = new JCheckBox();
		
		// create twelfth row checkBox
		JCheckBox checkBoxRow14_1 = new JCheckBox();
		JCheckBox checkBoxRow14_2 = new JCheckBox();
		JCheckBox checkBoxRow14_3 = new JCheckBox();
		JCheckBox checkBoxRow14_4 = new JCheckBox();
		JCheckBox checkBoxRow14_5 = new JCheckBox();
		JCheckBox checkBoxRow14_6 = new JCheckBox();
		JCheckBox checkBoxRow14_7 = new JCheckBox();
		JCheckBox checkBoxRow14_8 = new JCheckBox();
		JCheckBox checkBoxRow14_9 = new JCheckBox();
		JCheckBox checkBoxRow14_10 = new JCheckBox();
		JCheckBox checkBoxRow14_11 = new JCheckBox();
		JCheckBox checkBoxRow14_12 = new JCheckBox();
		JCheckBox checkBoxRow14_13 = new JCheckBox();
		JCheckBox checkBoxRow14_14 = new JCheckBox();
		JCheckBox checkBoxRow14_15 = new JCheckBox();
		JCheckBox checkBoxRow14_16 = new JCheckBox();
		
		// create fifteenth row checkBox
		JCheckBox checkBoxRow15_1 = new JCheckBox();
		JCheckBox checkBoxRow15_2 = new JCheckBox();
		JCheckBox checkBoxRow15_3 = new JCheckBox();
		JCheckBox checkBoxRow15_4 = new JCheckBox();
		JCheckBox checkBoxRow15_5 = new JCheckBox();
		JCheckBox checkBoxRow15_6 = new JCheckBox();
		JCheckBox checkBoxRow15_7 = new JCheckBox();
		JCheckBox checkBoxRow15_8 = new JCheckBox();
		JCheckBox checkBoxRow15_9 = new JCheckBox();
		JCheckBox checkBoxRow15_10 = new JCheckBox();
		JCheckBox checkBoxRow15_11 = new JCheckBox();
		JCheckBox checkBoxRow15_12 = new JCheckBox();
		JCheckBox checkBoxRow15_13 = new JCheckBox();
		JCheckBox checkBoxRow15_14 = new JCheckBox();
		JCheckBox checkBoxRow15_15 = new JCheckBox();
		JCheckBox checkBoxRow15_16 = new JCheckBox();
		
		// create sixteenth row checkBox
		JCheckBox checkBoxRow16_1 = new JCheckBox();
		JCheckBox checkBoxRow16_2 = new JCheckBox();
		JCheckBox checkBoxRow16_3 = new JCheckBox();
		JCheckBox checkBoxRow16_4 = new JCheckBox();
		JCheckBox checkBoxRow16_5 = new JCheckBox();
		JCheckBox checkBoxRow16_6 = new JCheckBox();
		JCheckBox checkBoxRow16_7 = new JCheckBox();
		JCheckBox checkBoxRow16_8 = new JCheckBox();
		JCheckBox checkBoxRow16_9 = new JCheckBox();
		JCheckBox checkBoxRow16_10 = new JCheckBox();
		JCheckBox checkBoxRow16_11 = new JCheckBox();
		JCheckBox checkBoxRow16_12 = new JCheckBox();
		JCheckBox checkBoxRow16_13 = new JCheckBox();
		JCheckBox checkBoxRow16_14 = new JCheckBox();
		JCheckBox checkBoxRow16_15 = new JCheckBox();
		JCheckBox checkBoxRow16_16 = new JCheckBox();
		
		/* insert the checkBox in center panel first row */
		// first row checkBox
		centerPanel.add(checkBoxRow1_1);
		centerPanel.add(checkBoxRow1_2);
		centerPanel.add(checkBoxRow1_3);
		centerPanel.add(checkBoxRow1_4);
		centerPanel.add(checkBoxRow1_5);
		centerPanel.add(checkBoxRow1_6);
		centerPanel.add(checkBoxRow1_7);
		centerPanel.add(checkBoxRow1_8);
		centerPanel.add(checkBoxRow1_9);
		centerPanel.add(checkBoxRow1_10);
		centerPanel.add(checkBoxRow1_11);
		centerPanel.add(checkBoxRow1_12);
		centerPanel.add(checkBoxRow1_13);
		centerPanel.add(checkBoxRow1_14);
		centerPanel.add(checkBoxRow1_15);
		centerPanel.add(checkBoxRow1_16);

		/* insert the checkBox in center panel second row */
		// second row checkBox
		centerPanel.add(checkBoxRow2_1);
		centerPanel.add(checkBoxRow2_2);
		centerPanel.add(checkBoxRow2_3);
		centerPanel.add(checkBoxRow2_4);
		centerPanel.add(checkBoxRow2_5);
		centerPanel.add(checkBoxRow2_6);
		centerPanel.add(checkBoxRow2_7);
		centerPanel.add(checkBoxRow2_8);
		centerPanel.add(checkBoxRow2_9);
		centerPanel.add(checkBoxRow2_10);
		centerPanel.add(checkBoxRow2_11);
		centerPanel.add(checkBoxRow2_12);
		centerPanel.add(checkBoxRow2_13);
		centerPanel.add(checkBoxRow2_14);
		centerPanel.add(checkBoxRow2_15);
		centerPanel.add(checkBoxRow2_16);
		
		/* insert the checkBox in center panel third row */
		// third row checkBox
		centerPanel.add(checkBoxRow3_1);
		centerPanel.add(checkBoxRow3_2);
		centerPanel.add(checkBoxRow3_3);
		centerPanel.add(checkBoxRow3_4);
		centerPanel.add(checkBoxRow3_5);
		centerPanel.add(checkBoxRow3_6);
		centerPanel.add(checkBoxRow3_7);
		centerPanel.add(checkBoxRow3_8);
		centerPanel.add(checkBoxRow3_9);
		centerPanel.add(checkBoxRow3_10);
		centerPanel.add(checkBoxRow3_11);
		centerPanel.add(checkBoxRow3_12);
		centerPanel.add(checkBoxRow3_13);
		centerPanel.add(checkBoxRow3_14);
		centerPanel.add(checkBoxRow3_15);
		centerPanel.add(checkBoxRow3_16);
		
		/* insert the checkBox in center panel forth row */
		// forth row checkBox
		centerPanel.add(checkBoxRow4_1);
		centerPanel.add(checkBoxRow4_2);
		centerPanel.add(checkBoxRow4_3);
		centerPanel.add(checkBoxRow4_4);
		centerPanel.add(checkBoxRow4_5);
		centerPanel.add(checkBoxRow4_6);
		centerPanel.add(checkBoxRow4_7);
		centerPanel.add(checkBoxRow4_8);
		centerPanel.add(checkBoxRow4_9);
		centerPanel.add(checkBoxRow4_10);
		centerPanel.add(checkBoxRow4_11);
		centerPanel.add(checkBoxRow4_12);
		centerPanel.add(checkBoxRow4_13);
		centerPanel.add(checkBoxRow4_14);
		centerPanel.add(checkBoxRow4_15);
		centerPanel.add(checkBoxRow4_16);
		
		
		/* insert the checkBox in center panel fifth row */
		// fifth row checkBox
		centerPanel.add(checkBoxRow5_1);
		centerPanel.add(checkBoxRow5_2);
		centerPanel.add(checkBoxRow5_3);
		centerPanel.add(checkBoxRow5_4);
		centerPanel.add(checkBoxRow5_5);
		centerPanel.add(checkBoxRow5_6);
		centerPanel.add(checkBoxRow5_7);
		centerPanel.add(checkBoxRow5_8);
		centerPanel.add(checkBoxRow5_9);
		centerPanel.add(checkBoxRow5_10);
		centerPanel.add(checkBoxRow5_11);
		centerPanel.add(checkBoxRow5_12);
		centerPanel.add(checkBoxRow5_13);
		centerPanel.add(checkBoxRow5_14);
		centerPanel.add(checkBoxRow5_15);
		centerPanel.add(checkBoxRow5_16);
		
		/* insert the checkBox in center panel sixth row */
		// sixth row checkBox
		centerPanel.add(checkBoxRow6_1);
		centerPanel.add(checkBoxRow6_2);
		centerPanel.add(checkBoxRow6_3);
		centerPanel.add(checkBoxRow6_4);
		centerPanel.add(checkBoxRow6_5);
		centerPanel.add(checkBoxRow6_6);
		centerPanel.add(checkBoxRow6_7);
		centerPanel.add(checkBoxRow6_8);
		centerPanel.add(checkBoxRow6_9);
		centerPanel.add(checkBoxRow6_10);
		centerPanel.add(checkBoxRow6_11);
		centerPanel.add(checkBoxRow6_12);
		centerPanel.add(checkBoxRow6_13);
		centerPanel.add(checkBoxRow6_14);
		centerPanel.add(checkBoxRow6_15);
		centerPanel.add(checkBoxRow6_16);
		
		/* insert the checkBox in center panel seventh row */
		// seventh row checkBox
		centerPanel.add(checkBoxRow7_1);
		centerPanel.add(checkBoxRow7_2);
		centerPanel.add(checkBoxRow7_3);
		centerPanel.add(checkBoxRow7_4);
		centerPanel.add(checkBoxRow7_5);
		centerPanel.add(checkBoxRow7_6);
		centerPanel.add(checkBoxRow7_7);
		centerPanel.add(checkBoxRow7_8);
		centerPanel.add(checkBoxRow7_9);
		centerPanel.add(checkBoxRow7_10);
		centerPanel.add(checkBoxRow7_11);
		centerPanel.add(checkBoxRow7_12);
		centerPanel.add(checkBoxRow7_13);
		centerPanel.add(checkBoxRow7_14);
		centerPanel.add(checkBoxRow7_15);
		centerPanel.add(checkBoxRow7_16);
		
		/* insert the checkBox in center panel eighth row */
		// eighth row checkBox
		centerPanel.add(checkBoxRow8_1);
		centerPanel.add(checkBoxRow8_2);
		centerPanel.add(checkBoxRow8_3);
		centerPanel.add(checkBoxRow8_4);
		centerPanel.add(checkBoxRow8_5);
		centerPanel.add(checkBoxRow8_6);
		centerPanel.add(checkBoxRow8_7);
		centerPanel.add(checkBoxRow8_8);
		centerPanel.add(checkBoxRow8_9);
		centerPanel.add(checkBoxRow8_10);
		centerPanel.add(checkBoxRow8_11);
		centerPanel.add(checkBoxRow8_12);
		centerPanel.add(checkBoxRow8_13);
		centerPanel.add(checkBoxRow8_14);
		centerPanel.add(checkBoxRow8_15);
		centerPanel.add(checkBoxRow8_16);
		
		/* insert the checkBox in center panel ninth row */
		// ninth row checkBox
		centerPanel.add(checkBoxRow9_1);
		centerPanel.add(checkBoxRow9_2);
		centerPanel.add(checkBoxRow9_3);
		centerPanel.add(checkBoxRow9_4);
		centerPanel.add(checkBoxRow9_5);
		centerPanel.add(checkBoxRow9_6);
		centerPanel.add(checkBoxRow9_7);
		centerPanel.add(checkBoxRow9_8);
		centerPanel.add(checkBoxRow9_9);
		centerPanel.add(checkBoxRow9_10);
		centerPanel.add(checkBoxRow9_11);
		centerPanel.add(checkBoxRow9_12);
		centerPanel.add(checkBoxRow9_13);
		centerPanel.add(checkBoxRow9_14);
		centerPanel.add(checkBoxRow9_15);
		centerPanel.add(checkBoxRow9_16);
		
		/* insert the checkBox in center panel tenth row */
		// tenth row checkBox
		centerPanel.add(checkBoxRow10_1);
		centerPanel.add(checkBoxRow10_2);
		centerPanel.add(checkBoxRow10_3);
		centerPanel.add(checkBoxRow10_4);
		centerPanel.add(checkBoxRow10_5);
		centerPanel.add(checkBoxRow10_6);
		centerPanel.add(checkBoxRow10_7);
		centerPanel.add(checkBoxRow10_8);
		centerPanel.add(checkBoxRow10_9);
		centerPanel.add(checkBoxRow10_10);
		centerPanel.add(checkBoxRow10_11);
		centerPanel.add(checkBoxRow10_12);
		centerPanel.add(checkBoxRow10_13);
		centerPanel.add(checkBoxRow10_14);
		centerPanel.add(checkBoxRow10_15);
		centerPanel.add(checkBoxRow10_16);
		
		/* insert the checkBox in center panel eleven row */
		// eleven row checkBox
		centerPanel.add(checkBoxRow11_1);
		centerPanel.add(checkBoxRow11_2);
		centerPanel.add(checkBoxRow11_3);
		centerPanel.add(checkBoxRow11_4);
		centerPanel.add(checkBoxRow11_5);
		centerPanel.add(checkBoxRow11_6);
		centerPanel.add(checkBoxRow11_7);
		centerPanel.add(checkBoxRow11_8);
		centerPanel.add(checkBoxRow11_9);
		centerPanel.add(checkBoxRow11_10);
		centerPanel.add(checkBoxRow11_11);
		centerPanel.add(checkBoxRow11_12);
		centerPanel.add(checkBoxRow11_13);
		centerPanel.add(checkBoxRow11_14);
		centerPanel.add(checkBoxRow11_15);
		centerPanel.add(checkBoxRow11_16);
		
		/* insert the checkBox in center panel twelfth row */
		// twelfth row checkBox
		centerPanel.add(checkBoxRow12_1);
		centerPanel.add(checkBoxRow12_2);
		centerPanel.add(checkBoxRow12_3);
		centerPanel.add(checkBoxRow12_4);
		centerPanel.add(checkBoxRow12_5);
		centerPanel.add(checkBoxRow12_6);
		centerPanel.add(checkBoxRow12_7);
		centerPanel.add(checkBoxRow12_8);
		centerPanel.add(checkBoxRow12_9);
		centerPanel.add(checkBoxRow12_10);
		centerPanel.add(checkBoxRow12_11);
		centerPanel.add(checkBoxRow12_12);
		centerPanel.add(checkBoxRow12_13);
		centerPanel.add(checkBoxRow12_14);
		centerPanel.add(checkBoxRow12_15);
		centerPanel.add(checkBoxRow12_16);
		
		/* insert the checkBox in center panel thirteenth row */
		// thirteenth row checkBox
		centerPanel.add(checkBoxRow13_1);
		centerPanel.add(checkBoxRow13_2);
		centerPanel.add(checkBoxRow13_3);
		centerPanel.add(checkBoxRow13_4);
		centerPanel.add(checkBoxRow13_5);
		centerPanel.add(checkBoxRow13_6);
		centerPanel.add(checkBoxRow13_7);
		centerPanel.add(checkBoxRow13_8);
		centerPanel.add(checkBoxRow13_9);
		centerPanel.add(checkBoxRow13_10);
		centerPanel.add(checkBoxRow13_11);
		centerPanel.add(checkBoxRow13_12);
		centerPanel.add(checkBoxRow13_13);
		centerPanel.add(checkBoxRow13_14);
		centerPanel.add(checkBoxRow13_15);
		centerPanel.add(checkBoxRow13_16);
		
		/* insert the checkBox in center panel fourteenth row */
		// fourteenth row checkBox
		centerPanel.add(checkBoxRow14_1);
		centerPanel.add(checkBoxRow14_2);
		centerPanel.add(checkBoxRow14_3);
		centerPanel.add(checkBoxRow14_4);
		centerPanel.add(checkBoxRow14_5);
		centerPanel.add(checkBoxRow14_6);
		centerPanel.add(checkBoxRow14_7);
		centerPanel.add(checkBoxRow14_8);
		centerPanel.add(checkBoxRow14_9);
		centerPanel.add(checkBoxRow14_10);
		centerPanel.add(checkBoxRow14_11);
		centerPanel.add(checkBoxRow14_12);
		centerPanel.add(checkBoxRow14_13);
		centerPanel.add(checkBoxRow14_14);
		centerPanel.add(checkBoxRow14_15);
		centerPanel.add(checkBoxRow14_16);
		
		/* insert the checkBox in center panel fifteenth row */
		// fifteenth row checkBox
		centerPanel.add(checkBoxRow15_1);
		centerPanel.add(checkBoxRow15_2);
		centerPanel.add(checkBoxRow15_3);
		centerPanel.add(checkBoxRow15_4);
		centerPanel.add(checkBoxRow15_5);
		centerPanel.add(checkBoxRow15_6);
		centerPanel.add(checkBoxRow15_7);
		centerPanel.add(checkBoxRow15_8);
		centerPanel.add(checkBoxRow15_9);
		centerPanel.add(checkBoxRow15_10);
		centerPanel.add(checkBoxRow15_11);
		centerPanel.add(checkBoxRow15_12);
		centerPanel.add(checkBoxRow15_13);
		centerPanel.add(checkBoxRow15_14);
		centerPanel.add(checkBoxRow15_15);
		centerPanel.add(checkBoxRow15_16);
		
		/* insert the checkBox in center panel sixteenth row */
		// sixteenth row checkBox
		centerPanel.add(checkBoxRow16_1);
		centerPanel.add(checkBoxRow16_2);
		centerPanel.add(checkBoxRow16_3);
		centerPanel.add(checkBoxRow16_4);
		centerPanel.add(checkBoxRow16_5);
		centerPanel.add(checkBoxRow16_6);
		centerPanel.add(checkBoxRow16_7);
		centerPanel.add(checkBoxRow16_8);
		centerPanel.add(checkBoxRow16_9);
		centerPanel.add(checkBoxRow16_10);
		centerPanel.add(checkBoxRow16_11);
		centerPanel.add(checkBoxRow16_12);
		centerPanel.add(checkBoxRow16_13);
		centerPanel.add(checkBoxRow16_14);
		centerPanel.add(checkBoxRow16_15);
		centerPanel.add(checkBoxRow16_16);
		
		/* insert the components into rightPanel */
		// create the buttons for rightPanel
		JButton startBtn = new JButton("Start");
		JButton stopBtn = new JButton("Stop");
		JButton tempoUpBtn = new JButton("Tempo Up");
		JButton tempoDownBtn = new JButton("Temo Down");
		
		rightPanel.add(startBtn);
		rightPanel.add(stopBtn);
		rightPanel.add(tempoUpBtn);
		rightPanel.add(tempoDownBtn);
		
		// Bold font for rightPanel
		Font font2 = new Font("serif", Font.BOLD, 15);
		rightPanel.setFont(font2);
		
		// for frame window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(670, 460);
		frame.setVisible(true);
	}
		
}
