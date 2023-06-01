package com.methodOverriding.entity;

public class SchoolStudent extends Student {
	String className;
	
	public SchoolStudent() {
		super();
		this.className = "10th";
	}
	public SchoolStudent(String className, int rollno, int percentage) {
		super(rollno, percentage);
		this.className = className;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("Class Name: "+className);
	}
}
