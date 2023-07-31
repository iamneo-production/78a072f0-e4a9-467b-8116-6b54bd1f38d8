package com.examly.springapp.controller;

public class ExistingAdmin {

	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public ExistingAdmin() {
		super();
	}
	public ExistingAdmin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
}
