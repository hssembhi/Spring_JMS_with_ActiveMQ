package com.spring.tutorials.amq;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

public class MyMessageConverter implements MessageConverter {

	public Message toMessage(Object object, Session session)
			throws JMSException, MessageConversionException {

		MyMessage myMessage = (MyMessage) object;

		MapMessage message = session.createMapMessage();

		message.setString("sender", myMessage.getSender());
		message.setString("sentOn", myMessage.getSentOn());
		message.setString("message", myMessage.getMessage());

		return message;
	}

	public Object fromMessage(Message message) throws JMSException,
			MessageConversionException {

		MapMessage mapMessage = (MapMessage) message;

		MyMessage myMessage = new MyMessage(mapMessage.getString("sender"),
				mapMessage.getString("sentOn"), mapMessage.getString("message"));

		return myMessage;

	}

}
