package com.moneylion.useraccessmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneylion.useraccessmanagement.model.User;
import com.moneylion.useraccessmanagement.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	private UserRepository userRepo;
	
	@Autowired
	public UserServiceImp(UserRepository userRepo)
	{
		this.userRepo = userRepo;
	}
	
	public List<User> fetchAll() 
	{
		return userRepo.findAll();
	}
	
	public User findByEmail(String email) 
	{
		return userRepo.findByEmail(email);
	}
}
