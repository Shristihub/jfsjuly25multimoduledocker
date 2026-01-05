package com.notifyapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements INotificationService {

	
	//autowire kafkTemplate, provide the topic name and send data
	
	@Autowired
	private KafkaTemplate<String, String> template;
	private final String topicName = "mytopic";
	
	@Override
	public void sendMessage(String message) {
		
		template.send(topicName, message);
	}

}
