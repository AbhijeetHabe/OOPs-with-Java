package com.oops.main;

import com.oops.entity.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee("Abhijeet",2156706,34000);
		System.out.println(e.getName());
		System.out.println(e.getEmployeeID());
		System.out.println(e.getBasicPay());
		e.showSalary();
	}

}
