package com.oops.entity;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 0.1;
		color= "red";
	}
	public void showCircle() {
		System.out.println("radius: "+radius);
		System.out.println("color: "+color);
	}
}
