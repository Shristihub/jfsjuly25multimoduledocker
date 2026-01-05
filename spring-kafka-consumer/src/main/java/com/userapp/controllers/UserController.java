package com.userapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userapp.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;

	@GetMapping("/show")
	public String getData() {
		return userService.consumeMessage();
	}
}
