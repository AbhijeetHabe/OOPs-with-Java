package com.interfaceandpackage.entity;

public class B extends A {
	int k;
	public B(int a, int b, int k) {
		super(a,b);
		this.k = k;
	}
	public void show() {
		System.out.println("Value of k is "+k);
	}
}
