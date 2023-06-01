package com.oopsTwo.main;

import com.oopsTwo.entity.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee em = new Employee(123456784, "Abhijeet", 30000);
		
		System.out.println("Name :"+em.getName()+" Salary "+em.getSalary());
		System.out.println("Raised salary: "+em.raiseSalary(17));
	}

}
