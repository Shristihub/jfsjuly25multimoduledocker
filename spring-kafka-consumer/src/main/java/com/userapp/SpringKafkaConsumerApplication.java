package com.userapp;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication
public class SpringKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaConsumerApplication.class, args);
	}
	
	@Bean
	JavaMailSender mailSender() {
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setHost("smtp.gmail.com");
		sender.setUsername("spriyamathan@gmail.com");
		sender.setPassword("eyun sesy gfhk meuo");
		sender.setPort(587);

		Properties prop = sender.getJavaMailProperties();
		prop.put("mail.transport.protocol","smtp" );
		prop.put("mail.smtp.starttls.required", true);
		prop.put("mail.smtp.starttls.enabled", true);
		prop.put("mail.smtp.auth", true);
		return sender;
	}

}
