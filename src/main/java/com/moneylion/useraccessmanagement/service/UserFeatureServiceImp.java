package com.moneylion.useraccessmanagement.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneylion.useraccessmanagement.model.UserFeature;
import com.moneylion.useraccessmanagement.repository.UserFeatureRepository;

@Service
public class UserFeatureServiceImp implements UserFeatureService {

	private UserFeatureRepository userFeatureRepo;
	private final Logger logger = LoggerFactory.getLogger(UserFeatureServiceImp.class);
	
	@Autowired
	public UserFeatureServiceImp(UserFeatureRepository userFeatureRepo)
	{
		this.userFeatureRepo = userFeatureRepo;
	}
	
	public UserFeature findByUserEmailAndFeatureName(Map<String, Object> params) 
	{
		logger.info("Params: " + params);
		String email = (String)params.get("email"); 
		String featureName = (String)params.get("featureName");
		UserFeature record = userFeatureRepo.findByUserEmailAndFeatureName(email, featureName);
		logger.info("Return: " + record);
		return record;
	}
	
	public void updateAccess(Map<String, Object> params) 
	{
		logger.info("Params: " + params);
		UserFeature userFeature = findByUserEmailAndFeatureName(params);
		Boolean access =(Boolean)params.get("enable");
		userFeature.setAccess(access);
		userFeatureRepo.save(userFeature);
		logger.info("Done updating user access!");
	}
}
