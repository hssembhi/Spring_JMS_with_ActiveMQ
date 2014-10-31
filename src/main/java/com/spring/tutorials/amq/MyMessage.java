package com.spring.tutorials.amq;

public class MyMessage{

	private String sender;
	private String sentOn;
	private String message;

	MyMessage(String sender, String sentOn, String message) {
		setSentOn(sentOn);
		setSender(sender);
		setMessage(message);
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSentOn() {
		return sentOn;
	}

	public void setSentOn(String sentOn) {
		this.sentOn = sentOn;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
