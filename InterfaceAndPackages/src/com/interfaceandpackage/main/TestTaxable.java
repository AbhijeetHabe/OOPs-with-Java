package com.interfaceandpackage.main;

import com.interfaceandpackage.entity.*;
import java.util.Scanner;

public class TestTaxable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID: ");
		int empid = sc.nextInt();
		System.out.println("Enter employee name: ");
		String name = sc.next();
		System.out.println("Enter employee salary: ");
		double salary = sc.nextInt();
		Employee emp = new Employee(empid,name,salary);
		emp.calcTax();
		System.out.println("Enter product ID: ");
		int pid = sc.nextInt();
		System.out.println("Enter product price: ");
		double price = sc.nextInt();
		System.out.println("Enter product quantity: ");
		int quantity = sc.nextInt();
		Product pro = new Product(pid,price,quantity);
		pro.calcTax();
	}

}
