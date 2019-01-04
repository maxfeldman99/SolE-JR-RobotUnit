package com.max.controller;


import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;


public class MotorController {
	private static MotorController instance = null;

	private EV3LargeRegulatedMotor motorA = null;
	private EV3LargeRegulatedMotor motorB = null;
	private EV3LargeRegulatedMotor motorC = null;
	private EV3LargeRegulatedMotor motorD = null;
	private MotorExecutor motorExecutor = null;

	private MotorController() {

	}

	public static MotorController getInstance() {
		if (instance == null) {
			instance = new MotorController();
		}

		return instance;
	}

	public void moveMotor(String port, int speed, int angle, int delayAmount) 
	{
		
		
		RegulatedMotor motor = getMotorByPort(port);
		motor.setSpeed(speed);
		
		
		motor.rotate(angle,false);
		
		Delay.msDelay(delayAmount);
		
		motor.resetTachoCount();
		
		motor.stop();
		
		
		//Thread executer = new Thread(motorExecutor);
//		
//			
//		switch (port) 
//		{
//		case "A":
//				synchronized (motorA)
//				{
//					motorExecutor.setMotor(new EV3LargeRegulatedMotor(MotorPort.A));
//
//				}
//
//
//			break;
//		case "B":
//			if (motorB == null) {
//				motorB = new EV3LargeRegulatedMotor(MotorPort.B);
//				synchronized (motorB) {
//					motorExecutor.setMotor(motorB);
//
//				}
//			}
//
//			break;
//		case "C":
//			if (motorC == null) {
//				motorC = new EV3LargeRegulatedMotor(MotorPort.C);
//			}
//			synchronized (motorC) {
//				motorExecutor.setMotor(motorC);
//
//			}
//
//			break;
//		case "D":
//			if (motorD == null) {
//				motorD = new EV3LargeRegulatedMotor(MotorPort.D);
//			}
//			synchronized (motorD) {
//				motorExecutor.setMotor(motorD);
//
//			}
//
//			break;
//
//		}
//		
//		executer.start();

	
		
	}

	
	public EV3LargeRegulatedMotor getMotorByPort(String port)
	{
		
		if(port.equals("A"))
		{
			if(motorA == null)
			{
				motorA = new EV3LargeRegulatedMotor(MotorPort.A);
			}

			return motorA;
		}
		
		if(port.equals("B"))
		{
			if(motorB == null)
			{
				motorB = new EV3LargeRegulatedMotor(MotorPort.B);
			}

			return motorB;
			
		}
		
		
		if(port.equals("C"))
		{
			if(motorC == null)
			{
				motorC = new EV3LargeRegulatedMotor(MotorPort.C);
			}

			return motorC;
			
		}
		
		if(port.equals("D"))
		{
			if(motorD == null)
			{
				motorD = new EV3LargeRegulatedMotor(MotorPort.D);
			}

			return motorD;
			
		}
		
		return null;
	}
	
}
