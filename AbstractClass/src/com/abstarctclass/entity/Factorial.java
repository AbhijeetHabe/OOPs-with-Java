package com.abstarctclass.entity;

public class Factorial extends Processor {
	public Factorial(int data) {
		super(data);
	}
	@Override
	public void process() {
		int num = data;
		int ans = 1;
		for(int i=1;i<=num;i++) {
			ans *= i;
		}
		
		System.out.println("Factorial of "+data+" is "+ans);
	}
}
