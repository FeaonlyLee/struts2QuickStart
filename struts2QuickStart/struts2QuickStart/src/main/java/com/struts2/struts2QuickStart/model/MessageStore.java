package com.struts2.struts2QuickStart.model;

public class MessageStore {
	private String message;

	public MessageStore() {
		message = "Hello Struts User";
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message + " (from toString)";
	}

}
