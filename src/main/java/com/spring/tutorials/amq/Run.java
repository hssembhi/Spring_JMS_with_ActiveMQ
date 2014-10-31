package com.spring.tutorials.amq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		final ApplicationContext context = new ClassPathXmlApplicationContext("active-mq-context.xml");

		final MessageSender messageSender = (MessageSender) context.getBean("messageSender");

		messageSender.send(new MyMessage("Universe", "29/10/2014", "Hello World!"));
		
		final MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");

		final MyMessage receiveMessage = messageReceiver.receive();
		
		System.out.println(receiveMessage.getSender() + " " + receiveMessage.getSentOn() + " " + receiveMessage.getMessage());

	}
}
