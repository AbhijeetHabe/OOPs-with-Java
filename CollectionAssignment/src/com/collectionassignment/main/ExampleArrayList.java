package com.collectionassignment.main;

import java.util.Collections;
import java.util.ArrayList;

public class ExampleArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Apple");
		arr.add("Banana");
		arr.add("Mango");
		arr.add("Grapes");
		arr.add("Orange");
		
		Collections.shuffle(arr);
		arr.forEach(System.out::println);
	}

}
