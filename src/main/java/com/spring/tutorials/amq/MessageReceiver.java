package com.spring.tutorials.amq;

import org.springframework.jms.core.JmsTemplate;

public class MessageReceiver {

	private JmsTemplate jmsTemplate;

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public MyMessage receive() {
		return (MyMessage) jmsTemplate.receiveAndConvert("MyTestQueue");
	}

}
