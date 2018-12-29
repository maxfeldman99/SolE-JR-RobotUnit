package com.max.models;

import java.util.ArrayList;

public class Request {
	
	// this class will be modified since we don't know team 2 structure yet
	String id;
	ArrayList<MotorRequest> sequence;
	int sizeOfSequence;
	
	public Request() {
		
	}

	public String getId() {
		return id;
	}

	public ArrayList<MotorRequest> getSequence() {
		return sequence;
	}

	public int getSizeOfSequence() {
		return sizeOfSequence;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", sequence=" + sequence + ", sizeOfSequence=" + sizeOfSequence + "]";
	}
	
	

}
