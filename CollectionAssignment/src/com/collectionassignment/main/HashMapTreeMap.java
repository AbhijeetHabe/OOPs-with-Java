package com.collectionassignment.main;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTreeMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		TreeMap<String, Integer> tmap = new TreeMap<>();
		
		map.put("Apple", 50);
		map.put("Orage", 30);
		map.put("Banana", 40);
		map.put("Grapes", 30);
		
		System.out.println("Contents of HashMap:");
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		tmap.put("Apple", 100);
		tmap.put("Banana", 50);
		tmap.put("Grapes", 80);
		tmap.put("Orange", 150);
		
		System.out.println("Contents of TreeMap:");
		for(Map.Entry<String, Integer> tentry: tmap.entrySet()) {
			System.out.println(tentry.getKey()+":"+tentry.getValue());
		}
	}

}
