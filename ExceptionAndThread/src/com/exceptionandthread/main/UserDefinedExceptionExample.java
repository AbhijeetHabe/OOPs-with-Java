package com.exceptionandthread.main;

import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number between 20-100");
			int num = sc.nextInt();
			if(num < 20 || num > 100) {
				throw new InvalidNumberException("Number should be betwwen 20-100");
			}
		} catch(InvalidNumberException e) {
			System.out.println("InvalidNumberException caught: " + e.getMessage());
		}
	}

}
