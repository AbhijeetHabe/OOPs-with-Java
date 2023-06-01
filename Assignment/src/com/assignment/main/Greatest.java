package com.assignment.main;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number  x: ");
		int x = sc.nextInt();
		System.out.println("Enter number  y: ");
		int y = sc.nextInt();
		System.out.println("Enter number  z: ");
		int z = sc.nextInt();
		int greatest = x;
		
//		if (y>greatest) {
//			greatest = y;
//		}
//		if (z>greatest) {
//			greatest = z;
//		}
		greatest = (y>greatest)?y:(z>greatest)?z:greatest;
		System.out.println("Greatest nember is: "+greatest);
	}

}
