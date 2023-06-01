package com.collectionassignment.main;

import com.collectionassignment.entity.Employee;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeSet {

	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<>();
		TreeSet<Integer> tSet = new TreeSet<>();
		
		Employee e1 = new Employee("Aniket",2134,32000);
		Employee e2 = new Employee("Raj",2124,42000);
		Employee e3 = new Employee("Abhijeet",2234,68000);
		Employee e4 = new Employee("Swaraj",1453,78000);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		tSet.add(33);
		tSet.add(44);
		tSet.add(33);
		tSet.add(34);
		
		set.forEach(System.out::println);
		tSet.forEach(System.out::println);
	}

}
