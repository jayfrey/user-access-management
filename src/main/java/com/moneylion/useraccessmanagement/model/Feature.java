package com.moneylion.useraccessmanagement.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "feature")
public class Feature {

  @Id 
  @GeneratedValue
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @OneToMany(mappedBy = "feature")
  private Set<UserFeature> userFeature;

  public Feature() {}

  public Feature(String name)
  {
    this.name = name;
  }

  public Long getId() 
  {
    return this.id;
  }

  public String getName() 
  {
    return this.name;
  }

  public void setId(Long id) 
  {
    this.id = id;
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  @Override
  public String toString() {
    return "{" + 
    		"id=" + this.id + 
    		", name='" + this.name + '\'' + 
    		'}';
  }
}