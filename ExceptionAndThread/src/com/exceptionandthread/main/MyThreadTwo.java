package com.exceptionandthread.main;

public class MyThreadTwo extends  Thread {
	int number;
	
	public MyThreadTwo(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" from Thread number: "+number);
			try {
				Thread.sleep(3000);
			}
			catch (InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
