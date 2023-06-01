package com.oops.main;

import com.oops.entity.BankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(1234,10000,"Abhijeet");
		System.out.println("Account balance before: "+acc.getBal());
		acc.deposit();
		acc.withdraw();	
		System.out.println("Account balance after: "+acc.getBal());
	}

}
