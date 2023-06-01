package com.collectionassignment.entity;

import java.util.Objects;

public class Employee {
	String empName;
	int empCode, empSalary;
	public Employee(String empName, int empCode, int empSalary) {
		this.empName = empName;
		this.empCode = empCode;
		this.empSalary = empSalary;
	}
	public String getName() {
		return empName;
	}
	public int empCode() {
		return empCode;
	}
	public int empSalary() {
		return empSalary;
	}
	@Override
	public String toString() {
		return empCode+ " : " +empName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empCode == other.empCode;
	}
}
