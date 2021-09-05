package com.moneylion.useraccessmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneylion.useraccessmanagement.model.UserFeature;

public interface UserFeatureRepository extends JpaRepository<UserFeature, Long> {
	
	UserFeature findByUserEmailAndFeatureName(String name, String featureName);
}