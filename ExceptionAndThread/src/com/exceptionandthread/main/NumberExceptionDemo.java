package com.exceptionandthread.main;

public class NumberExceptionDemo {

	public static void main(String[] args) {
		if (args.length < 3) {
            System.out.println("Please enter three command-line arguments");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            System.out.println("The sum of the three numbers is: " + (num1 + num2 + num3));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
	}

}
