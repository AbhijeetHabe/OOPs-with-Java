package com.oops.entity;

public class BankAccount {
	private String name;
	private int accNum, bal;
	
	public BankAccount(int accNum, int bal, String name) {
		this.accNum = accNum;
		this.bal = bal;
		this.name = name;
	}
	public int getBal() {
		return this.bal;
	}
	public int deposit() {
		return this.bal += 1000;
	}
	public int withdraw() {
		return this.bal -= 500;
	}
}
