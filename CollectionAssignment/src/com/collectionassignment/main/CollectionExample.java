package com.collectionassignment.main;

import com.collectionassignment.entity.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> emp = new ArrayList<>();
		
		Employee e1 = new Employee("Aniket",2134,32000);
		Employee e2 = new Employee("Raj",2124,42000);
		Employee e3 = new Employee("Abhijeet",2234,68000);
		Employee e4 = new Employee("Swaraj",1453,78000);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		System.out.println("Enter the employee code to search: ");
		int code = sc.nextInt();
		
		for(Employee list:emp) {
			if(list.empCode() == code) {
				System.out.println("Employee Name: "+list.getName());
				System.out.println("Employee Code: "+list.empCode());
				System.out.println("Employee Salary: "+list.empSalary());
			}
		}
	}

}
