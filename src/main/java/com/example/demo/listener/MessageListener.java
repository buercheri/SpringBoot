package com.example.demo.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

	@JmsListener(destination="inmemory.queue")
	public void listenMessage(String message) {
		System.out.println("Received message: " + message);
	}
}
