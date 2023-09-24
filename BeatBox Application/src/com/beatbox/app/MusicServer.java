package com.beatbox.app;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.net.*;

public class MusicServer {

	final List<ObjectOutputStream> clientOutputStreams = new ArrayList<> ();
	
	public static void main(String[] args) {
		
		new MusicServer().go();
	}

	public void go() {
		try (ServerSocket serverSocket = new ServerSocket(4242)) {
			ExecutorService threadPool = Executors.newCachedThreadPool();
			
			while(!serverSocket.isClosed()) {
				Socket clientSocket = serverSocket.accept();
				ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
				clientOutputStreams.add(out);
				ClientHandler clientHandler = new ClientHandler(clientSocket);
				threadPool.execute(clientHandler);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void tellEveryOne(Object one, Object two) {
		for(ObjectOutputStream clientOutputStream : clientOutputStreams) {
			try {
				clientOutputStream.writeObject(one);
				clientOutputStream.writeObject(two);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public class ClientHandler implements Runnable {
		private ObjectInputStream in;
		
		public ClientHandler(Socket socket) {
			try {
				in = new ObjectInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			Object userName;
			Object beatSequence;
			
			try {
				while((userName = in.readObject()) != null) {
					beatSequence = in.readObject();
					
					System.out.println("read two objects");
					tellEveryOne(userName, beatSequence);
				}
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
