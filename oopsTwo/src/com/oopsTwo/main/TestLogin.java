package com.oopsTwo.main;

import com.oopsTwo.entity.Login;
import java.util.Scanner;

public class TestLogin {

	public static void main(String[] args) {
		String username, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of users: ");
		int n = sc.nextInt();
		Login[] user = new Login[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter username: ");
			username = sc.next();
			System.out.println("Enter password: ");
			password = sc.next();
			user[i] = new Login(username, password);
		}
		System.out.println("Enter username to login: ");
		String usern = sc.next();
		System.out.println("Enter password to login: ");
		String pass = sc.next();
		for(int i=0;i<n;i++) {
			user[i].login(usern, pass);
		}
		
		for(int i=0;i<n;i++) {
			user[i].printValue();
		}
	}

}
