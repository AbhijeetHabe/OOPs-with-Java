package com.abstarctclass.entity;

public class Circle extends Processor {
	
	public Circle(int data) {
		super(data);
	}
	public void process() {
		int radius = data;
		double pi = 3.14;
		
		double ans = pi*radius*radius;
		
		System.out.println("Area of circle for radius "+data+" is "+ans);
	}
}
