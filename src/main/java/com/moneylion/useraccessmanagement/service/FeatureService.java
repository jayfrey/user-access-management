package com.moneylion.useraccessmanagement.service;

import java.util.List;

import com.moneylion.useraccessmanagement.model.Feature;

public interface FeatureService {

	public List<Feature> fetchAll();
	public Feature findByName(String name);
}
