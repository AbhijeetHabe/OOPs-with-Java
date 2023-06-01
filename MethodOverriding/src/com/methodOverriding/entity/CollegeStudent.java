package com.methodOverriding.entity;

public class CollegeStudent extends Student {
	String sem;
	
	public CollegeStudent() {
		super();
		this.sem = "1st";
	}
	public CollegeStudent(String sem, int rollno, int percentage) {
		super(rollno, percentage);
		this.sem = sem;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("Semester: "+sem);
	}
}
