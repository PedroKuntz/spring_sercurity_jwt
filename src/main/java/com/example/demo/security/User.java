package com.example.demo.security;

public class User {
	
	private String userName;
	private String password;
	
	public User() {}
	
	public User(String name, String passwd) {
		this.userName = name;
		this.password = passwd;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
