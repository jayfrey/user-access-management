package com.moneylion.useraccessmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneylion.useraccessmanagement.model.Feature;
import com.moneylion.useraccessmanagement.repository.FeatureRepository;

@Service
public class FeatureServiceImp implements FeatureService {

	private FeatureRepository featureRepo;
	
	@Autowired
	public FeatureServiceImp(FeatureRepository featureRepo)
	{
		this.featureRepo = featureRepo;
	}
	
	public List<Feature> fetchAll() 
	{
		return featureRepo.findAll();
	}
	
	public Feature findByName(String name) 
	{
		return featureRepo.findByName(name);
	}
}
