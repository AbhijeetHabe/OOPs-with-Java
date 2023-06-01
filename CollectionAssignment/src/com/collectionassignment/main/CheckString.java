package com.collectionassignment.main;

public class CheckString {

	public static void main(String[] args) {
		String str = "I am Studying in CDAC";
		String check = "CDAC";

		if(str.contains(check)) {
			System.out.println("String is present: "+check);
		}
	}
}
