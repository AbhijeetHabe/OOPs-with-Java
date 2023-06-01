package com.collectionassignment.main;

import java.util.Calendar;

public class ExampleCalender {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println("Day/Month/Year : "+day+"/"+(month+1)+"/"+year);
		System.out.println("Hour:Minute:Second : "+hour+":"+minute+":"+second);
	}

}
