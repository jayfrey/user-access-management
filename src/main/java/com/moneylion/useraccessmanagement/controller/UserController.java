package com.moneylion.useraccessmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneylion.useraccessmanagement.model.User;
import com.moneylion.useraccessmanagement.service.FeatureService;
import com.moneylion.useraccessmanagement.service.UserFeatureService;
import com.moneylion.useraccessmanagement.service.UserService;

@RestController
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/user/all")
	public List<User> all() 
	{
		return userService.fetchAll();
	}

}