package com.exceptionandthread.main;

public class ArrayExceptionDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		try {
			System.out.println("Array element at index is: "+arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught: "
					+e.getMessage());
		}
	}

}
