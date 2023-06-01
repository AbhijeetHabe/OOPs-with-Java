package com.oops.main;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}		

	}

}
