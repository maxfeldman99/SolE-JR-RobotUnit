package com.max.robotServer;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.max.controller.RobotController;
import com.max.models.MotorRequest;
import com.max.models.Request;

import lejos.hardware.Sound;

public class Server implements Runnable {

	private final int PORT = 12345;
	private boolean SERVER_IS_RUNNING = true;
	private ObjectInputStream inputStream = null;
	private ObjectOutputStream outputStream = null;
	private ServerSocket serverSocket;
	private Socket socket;
	
	private Gson gson;
	private RobotController controller;

	
	public Server() 
	{
		controller = RobotController.getInstance();
		gson = new Gson();
	}
		
		@Override
		public void run() {
			while(SERVER_IS_RUNNING) {
			try {
				Sound.beep();
				serverSocket= new ServerSocket(PORT);
				socket  = serverSocket.accept();
				inputStream = new ObjectInputStream(socket.getInputStream());
				//outputStream = new ObjectOutputStream(socket.getOutputStream());
				String str = null; 
				try {
					//str = (String)inputStream.readObject();
					str = (String)inputStream.readObject();		
					//ArrayList<MotorRequest> request = new ArrayList<>();
					Request request = gson.fromJson(str, Request.class);
					//Request request = gson.fromJson(str, Request.class);
					
					controller.executeSequence(request.getSequence());
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				//System.out.println("messege: "+str);
				
				
				
				} catch (IOException e) {
				e.printStackTrace();
				
			} finally {
				
				try {
					serverSocket.close();
					
					//SERVER_IS_RUNNING = false;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
			
		}
}
