package com.assignment.main;

import java.util.Scanner;

public class Marriage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a male(m) or female(f): ");
		char gender = sc.next().charAt(0);
		System.out.println("What is your age? ");
		int age = sc.nextInt();
		
		if (gender=='m' & age>=21) {
			System.out.println("You are eligible for marriage");
		}
		else if (gender=='f' & age>=21) {
			System.out.println("You are eligible for marriage");
		}
		else {
			System.out.println("You are not eligible for marriage");
		}
	}

}
