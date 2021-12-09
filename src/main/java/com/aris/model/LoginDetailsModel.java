package com.aris.model;

public class LoginDetailsModel {
	
	public LoginDetailsModel(String username, String password) {
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDetailsModel [username=" + username + ", password=" + password + "]";
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
	private String username;
	private String password;

}
