package com.abstarctclass.entity;

public abstract class Processor {
	int data;
	
	public Processor(int data) {
		this.data = data;
	}
	
	public void showData() {
		System.out.println("Value of data: "+data);
	}
	public abstract void process();
}
