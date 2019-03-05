package com.example.demo.config;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@Profile("prod")
public class StandaloneApacheMqConfig {
	@Value(value = "${activemq.broker-url}")
	private String brokerUrl;

	@Bean
	public Queue createQueue() {
		return new ActiveMQQueue("standalone.queue");
	}
	
	@Bean
	public ActiveMQConnectionFactory createActiveMQConnectionFactory() {
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		factory.setBrokerURL(brokerUrl);
		return factory;
	}
	
	@Bean
	public JmsTemplate createJmsTemplate() {
		return new JmsTemplate(createActiveMQConnectionFactory());
	}
}
