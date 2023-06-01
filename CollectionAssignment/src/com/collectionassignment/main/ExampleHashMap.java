package com.collectionassignment.main;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class ExampleHashMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(12, 3311);
		map.put(13, 3211);
		map.put(14, 3511);
		map.put(15, 3611);
		
		Set<Entry<Integer, Integer>> eset = map.entrySet();
		
		for(Entry<Integer, Integer> e : eset)
			System.out.println(e.getKey() + " : " + e.getValue());
	}

}
