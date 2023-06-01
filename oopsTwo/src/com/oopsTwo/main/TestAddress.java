package com.oopsTwo.main;

import com.oopsTwo.entity.Address;
import java.util.Scanner;

public class TestAddress {

	public static void main(String[] args) {
		int n;
		String name, streetAddress, city, state;
		int ZIPcode;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		n = sc.nextInt();
		Address[] person = new Address[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Persons name: ");
			name = sc.next();
			System.out.println("Enter Persons address: ");
			streetAddress = sc.next();
			System.out.println("Enter Persons city: ");
			city = sc.next();
			System.out.println("Enter Persons state: ");
			state = sc.next();
			System.out.println("Enter Persons ZIP code: ");
			ZIPcode = sc.nextInt();
			
			person[i] = new Address(name,streetAddress,city,state,ZIPcode);
		}
		for(int i=0;i<n;i++) {
			person[i].printAddress();
		}
		System.out.println("\nEnter name to search address: ");
		String nme = sc.next();
		for(int i=0;i<n;i++) {
			if(nme == person[i].getName()) {
				person[i].printAddress();
			}
		}
	}

}
