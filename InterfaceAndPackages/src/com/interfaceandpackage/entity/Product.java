package com.interfaceandpackage.entity;

public class Product implements Taxable {
	int pid, quantity;
	double price;
	
	public Product(int pid, double price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	public void calcTax() {
		double salesTaxAmount = salesTax*price*quantity;
		System.out.println("Sales tax for product id "+pid+" and quatity "
				+quantity+" is "+salesTaxAmount);
	}
}
