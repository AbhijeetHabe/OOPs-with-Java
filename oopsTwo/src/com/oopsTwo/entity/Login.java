package com.oopsTwo.entity;

public class Login {
	private String username, password, status;
	
	public Login(String username, String password) {
		this.username = username;
		this.password = password;
		this.status= "enabled";
	}
	public void login(String username, String password) {
		if(this.username.equals(username)) {
			if(this.password.equals(password)) {
				System.out.println("Welcome "+username);
			} else {
				System.out.println("Invalid credentials");
				this.status = "disabled";
			}
		}
	}
	public void printValue() {
		System.out.println("Username: "+username+" status: "+status);
	}
}
