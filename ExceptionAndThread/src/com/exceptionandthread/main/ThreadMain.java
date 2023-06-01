package com.exceptionandthread.main;

public class ThreadMain {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}

}
