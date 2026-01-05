package com.notifyapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.notifyapp.service.INotificationService;

@RestController
public class NotificationController {
	
	@Autowired
	private INotificationService notificationService;

	@GetMapping("/notify/{message}")
	public String notifyUser(@PathVariable String message) {
		notificationService.sendMessage(message);
		return "success";
	}
}
