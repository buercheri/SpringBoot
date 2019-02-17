package com.example.demo.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@EnableJms
@Configuration
public class EmbeddedApacheMqConfig {

	@Bean
	public Queue createQueue() {
		return new ActiveMQQueue("inmemory.queue");
	}
	
//	@Bean
//	public JmsTemplate createJmsTemplate() {
//		return new JmsTemplate();
//	}
}
