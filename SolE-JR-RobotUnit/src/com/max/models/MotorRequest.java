package com.max.models;

public class MotorRequest extends RobotRequest {

	private String motorId;
	private String port;
	private String speed;
	private String angle;
	private String delayAmount;
	
	public MotorRequest() {
		
	}

	public String getMotorId() {
		return motorId;
	}

	public void setMotorId(String motorId) {
		this.motorId = motorId;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getAngle() {
		return angle;
	}

	public void setAngle(String angle) {
		this.angle = angle;
	}

	public String getDelayAmount() {
		return delayAmount;
	}

	public void setDelayAmount(String delayAmount) {
		this.delayAmount = delayAmount;
	}

	
	
	
}
