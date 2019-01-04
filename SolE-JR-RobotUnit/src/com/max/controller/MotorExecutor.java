package com.max.controller;

import lejos.hardware.Sound;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class MotorExecutor implements Runnable {
		
	private RegulatedMotor motor;
	private int speed;
	private int angle;
	private int delayAmount;
	
	public MotorExecutor(RegulatedMotor motor,String port,int speed,int angle,int delayAmount) {
		this.motor = motor;
		this.speed = speed;
		this.angle = angle;
		this.delayAmount = delayAmount;
	}
	
	public void setMotor(RegulatedMotor motor) {
		this.motor = motor;
	}
	
	private void executeMotor(RegulatedMotor motor,int speed, int angle,int delayAmount) {
		
		motor.setSpeed(speed);
		motor.backward();
		Delay.msDelay(delayAmount);
		motor.stop();
		motor.close();
	}

	@Override
	public void run() 
	{
		executeMotor(motor, speed, angle, delayAmount);
	}

}
