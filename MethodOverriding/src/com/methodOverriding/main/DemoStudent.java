package com.methodOverriding.main;

import com.methodOverriding.entity.*;

public class DemoStudent {

	public static void main(String[] args) {
		Student[] s = new Student[5];
		
		s[0] = new CollegeStudent("1st",5,98);
		s[1] = new CollegeStudent("3rd",9,94);
		s[2] = new CollegeStudent("4th",14,78);
		s[3] = new SchoolStudent("10th",34,88);
		s[4] = new SchoolStudent("11th",6,98);
		System.out.println("\nPrint all records: ");
		for (Student student : s) {
			student.show();
			System.out.println();
		}
		int searchRollno = 6;
		boolean found = false;
		for(Student student: s) {
			if(searchRollno == student.rollno) {
				if (student instanceof CollegeStudent) {
					System.out.println("Roll no is of College Student.");
				} 
				else if (student instanceof SchoolStudent) {
					System.out.println("Roll no is of School Student.");
				}
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Roll no not found");
		}
		int count = 0;
		for(Student student: s) {
			if(student.percentage > 75) {
				count+= 1;
			}
		}
		System.out.println("Number of students having A grade: "+count);
	}

}
