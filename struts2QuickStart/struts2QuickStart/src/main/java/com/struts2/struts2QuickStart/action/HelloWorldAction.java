package com.struts2.struts2QuickStart.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.struts2QuickStart.model.MessageStore;

public class HelloWorldAction extends ActionSupport {
	private MessageStore messageStore;
	private static int helloCount = 0;
	private String userName;

	@Override
	public String execute() {
		messageStore = new MessageStore();
		if (userName != null) {
			messageStore.setMessage(messageStore.getMessage() + " " + userName);
		}
		helloCount++;
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public int getHelloCount() {
		return helloCount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
