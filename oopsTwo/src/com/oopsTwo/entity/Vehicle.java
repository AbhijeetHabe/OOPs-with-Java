package com.oopsTwo.entity;

public class Vehicle {
	public String fuelType;
	public int speed;
	public String engineStatus;
	
	public Vehicle(String fuelType) {
		this.fuelType = fuelType;
		this.speed = 0;
		this.engineStatus = "OFF";
	}
	public void startEngine() {
		this.engineStatus = "ON";
		this.speed = 0;
	}
}
