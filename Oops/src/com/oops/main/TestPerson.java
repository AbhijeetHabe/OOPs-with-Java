package com.oops.main;

import com.oops.entity.Person;

public class TestPerson {

	public static void main(String[] args) {
		Person[] people = new Person[2];
		people[0] = new Person("Abhijeet",20);
		people[1] = new Person("Aniket",23);
		
		Person oldest = people[0];
		for (int i=0;i<people.length;i++) {
			System.out.println(people[i].getName()+" is "+people[i].getAge()+
					" years old.");
			if (people[i].getAge()>oldest.getAge()) {
				oldest = people[i];
			}
		}
		System.out.println("The oldest person is "+oldest.getName()+" who is "+
		oldest.getAge()+" years old.");
	}

}
