package com.interfaceandpackage.entity;

public class Employee implements Taxable {
	int empid;
	String name;
	double salary;
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public void calcTax() {
		double incomeTaxAmount = salary * incomeTax;
		System.out.println("Income tax of employee "+name+" and empid "
				+empid+" is "+incomeTaxAmount);
	}
}
