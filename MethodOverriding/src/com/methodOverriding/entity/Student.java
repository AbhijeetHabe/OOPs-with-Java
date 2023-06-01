package com.methodOverriding.entity;

public class Student {
	public int rollno, percentage;
	
	public Student() {
		this.rollno = 0;
		this.percentage = 0;
	}

	public Student(int rollno, int percentage) {
		this.rollno = rollno;
		this.percentage = percentage;
	}
	public void show() {
		System.out.println("Roll no.: "+rollno+" Pecentage: "+percentage);
	}
}
