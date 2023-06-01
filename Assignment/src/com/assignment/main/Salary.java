package com.assignment.main;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double gs = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		int bs = sc.nextInt();
		
		if (bs<10000) {
			gs = bs+(0.1*bs)+(0.9*bs);
		} else if (bs>=10000) {
			gs = bs+(2000)+(0.98*bs);
		}
		
		System.out.println("Gross salary is: "+gs);
	}

}
