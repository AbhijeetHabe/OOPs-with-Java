package com.assignment.main;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number x: ");
		int x = sc.nextInt();
		System.out.println("Enter number y: ");
		int y = sc.nextInt();
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("X is "+x+" Y is "+y);
	}

}
