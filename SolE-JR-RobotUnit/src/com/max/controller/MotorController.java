package com.max.controller;


import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;


public class MotorController {
	private static MotorController instance = null;

	private RegulatedMotor motorA = null;
	private RegulatedMotor motorB = null;
	private RegulatedMotor motorC = null;
	private RegulatedMotor motorD = null;
	private MotorExecutor motorExecutor = null;

	private MotorController() {

	}

	public static MotorController getInstance() {
		if (instance == null) {
			instance = new MotorController();
		}

		return instance;
	}

	public void moveMotor(String port, int speed, int angle, int delayAmount) {
		motorExecutor = new MotorExecutor(null, port, speed, angle, delayAmount);

		Thread executer = new Thread(motorExecutor);

		switch (port) {
		case "A":
			if (motorA == null) {
				motorA = new EV3LargeRegulatedMotor(MotorPort.A);

				synchronized (motorA) {
					motorExecutor.setMotor(motorA);
					executer.start();

				}

			}

			break;
		case "B":
			if (motorB == null) {
				motorB = new EV3LargeRegulatedMotor(MotorPort.B);
				synchronized (motorB) {
					motorExecutor.setMotor(motorB);
					executer.start();

				}
			}

			break;
		case "C":
			if (motorC == null) {
				motorC = new EV3LargeRegulatedMotor(MotorPort.C);
			}
			synchronized (motorC) {
				motorExecutor.setMotor(motorC);
				executer.start();

			}

			break;
		case "D":
			if (motorD == null) {
				motorD = new EV3LargeRegulatedMotor(MotorPort.D);
			}
			synchronized (motorD) {
				motorExecutor.setMotor(motorD);
				executer.start();

			}

			break;

		}

	}

}
