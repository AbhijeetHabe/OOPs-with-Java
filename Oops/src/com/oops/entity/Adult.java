package com.oops.entity;

public class Adult {
	private String name, address;
	private int age;
	public Adult(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getFullName() {
		return name;
	}
	public boolean isAdult() {
		if(this.age>18) {
			return true;
		} else {
			return false;
		}
	}
}
