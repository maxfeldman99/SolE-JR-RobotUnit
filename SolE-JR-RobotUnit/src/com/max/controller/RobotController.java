package com.max.controller;

import java.util.ArrayList;

import com.max.models.MotorRequest;
import com.max.models.RobotRequest;

public class RobotController 
{
	private static RobotController instance = null;
	private MotorController motorController;
	
	
	private RobotController()
	{
		motorController = MotorController.getInstance();
	}
	
	public static RobotController getInstance() 
	{
		if(instance == null)
		{
			instance = new RobotController();
		}
		
		return instance;
	}
	
	public void executeSequence(ArrayList<MotorRequest> arrlist)
	{
		
		for(int i= 0;i<arrlist.size();i++) {
			
			
				MotorRequest tempMotor = arrlist.get(i);
				int speed = Integer.parseInt(tempMotor.getSpeed());
				int angle = Integer.parseInt(tempMotor.getAngle());
				int delayAmount  = Integer.parseInt(tempMotor.getDelayAmount());

				
				motorController.moveMotor(tempMotor.getPort(), speed, angle,delayAmount);
				
			}
			
			
		}
		
		
	}


