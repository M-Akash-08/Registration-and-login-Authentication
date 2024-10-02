package com.project.loginAndRegistration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;
	private String password;
	private String fullName;
	
	public User() {
		
	}
	
	public User(String username,String password,String fullName) {
		this.username=username;
		this.password=password;
		this.fullName=fullName;
	}


	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "["+"id"+id+"username="+username+"password="+password+"fullname="+fullName+"]";
	}
	
}
