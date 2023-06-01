package com.exceptionandthread.main;

public class ThreadMainTwo {

	public static void main(String[] args) {
		
		MyThreadTwo t1 = new MyThreadTwo(1);
		MyThreadTwo t2 = new MyThreadTwo(2);
		MyThreadTwo t3 = new MyThreadTwo(3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
