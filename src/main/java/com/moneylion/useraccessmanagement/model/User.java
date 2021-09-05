package com.moneylion.useraccessmanagement.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {

  @Id 
  @GeneratedValue
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @Email
  @Column(name = "email")
  private String email;

  @OneToMany(mappedBy = "user")
  public Set<UserFeature> userFeature;

  public User() {}

  public User(String name, String email)
  {
    this.name = name;
    this.email = email;
  }

  public Long getId()
  {
    return this.id;
  }

  public String getName()
  {
    return this.name;
  }

  public String getEmail()
  {
    return this.email;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

   @Override
   public String toString() 
   {
     return "{" + 
    		 "id=" + this.id + 
    		 ", name='" + this.name + '\'' + 
    		 ", email='" + this.email + '\'' + 
    		 '}';
   }
}