package com.assignment.main;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		int fahren = sc.nextInt();
		float celsius = 5*(fahren-32)/9;
		
		System.out.println("Temperature in celsius is: "+celsius);
	}

}
