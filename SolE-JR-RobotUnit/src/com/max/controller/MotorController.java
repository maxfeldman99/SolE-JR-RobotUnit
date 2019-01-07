package com.max.controller;


import lejos.hardware.Sound;
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
		
		Sound.beep();
		
		motor.rotate(angle,true);
		
		Delay.msDelay(delayAmount);
		
		motor.resetTachoCount();
		
		
		
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
	
	public void closeMotors() {
		motorA.close();
		motorB.close();
		motorC.close();
		motorD.close();
	}
}
