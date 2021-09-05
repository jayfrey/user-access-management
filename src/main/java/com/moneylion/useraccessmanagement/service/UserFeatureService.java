package com.moneylion.useraccessmanagement.service;

import java.util.Map;

import com.moneylion.useraccessmanagement.model.UserFeature;

public interface UserFeatureService {

	public UserFeature findByUserEmailAndFeatureName(Map<String, Object> params);
	public void updateAccess(Map<String, Object> params);
	
}
