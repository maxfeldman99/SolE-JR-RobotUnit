package com.max.models;

public class RobotRequest { // the request class will be converted to this class (robotRequest) after parsing
	
	public RobotRequest() {
		
	}
	
	private String id;
	private String type;
	private String payload;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	@Override
	public String toString() {
		return "RobotRequest [id=" + id + ", type=" + type + ", payload=" + payload + "]";
	}
	
	
	
	
}
