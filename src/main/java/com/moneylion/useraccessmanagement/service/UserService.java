package com.moneylion.useraccessmanagement.service;

import java.util.List;

import com.moneylion.useraccessmanagement.model.User;

public interface UserService {
	
	public List<User> fetchAll();
	public User findByEmail(String email);
}
