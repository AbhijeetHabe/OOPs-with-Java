package com.exceptionandthread.main;

public class DivideByZeroExcept {

	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 0;
			System.out.println("Divide number"+(a/b));
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
