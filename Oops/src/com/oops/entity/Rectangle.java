package com.oops.entity;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	public int getArea() {
		return length*breadth;
	}
}
