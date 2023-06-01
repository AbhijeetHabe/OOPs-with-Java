package com.oops.main;

import com.oops.entity.Adult;

public class TestAdult {

	public static void main(String[] args) {
		Adult per = new Adult("Abhijeet Habe",20,"Maharashtra");
		System.out.println("Full name is "+per.getFullName());
		System.out.println(per.getFullName()+" is an adult: "+per.isAdult());
	}

}
