package com.oopsTwo.entity;

public class Employee {
	private long id;
	private String name;
	private double salary;
	
	public Employee(long id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public double raiseSalary(double percent) {
		double raise;
		raise = salary+(percent/100)*salary;
		return raise;
	}
}
