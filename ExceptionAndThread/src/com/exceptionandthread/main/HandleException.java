package com.exceptionandthread.main;

public class HandleException {

	public static void main(String[] args) {
		Object obj = null;
		
		try {
			obj.toString();
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException caught: "+e.getMessage());
		}
	}

}
