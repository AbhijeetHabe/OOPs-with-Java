package com.oops.entity;

public class Employee {
	private String name;
	private int eid, basic;
	private float DA, HRA, grossPay;
	
	public Employee(String name, int eid, int basic) {
		this.name = name;
		this.eid = eid;
		this.basic = basic;
	}
	public String getName() {
		return name;
	}
	public int getEmployeeID() {
		return eid;
	}
	public int getBasicPay() {
		return basic;
	}
	public void showSalary() {
		if(basic<3500) {
			DA = (0.45f*basic);
			HRA = (0.2f*basic);
			grossPay = DA+HRA+basic;
			System.out.println("Gross pay is :"+grossPay);
		} else if(basic>=3500) {
			DA = (0.5f*basic);
			HRA = 1000;
			grossPay = DA+HRA+basic;
			System.out.println("Gross pay is :"+grossPay);
		}
	}
}
