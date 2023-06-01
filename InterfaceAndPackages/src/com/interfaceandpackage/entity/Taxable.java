package com.interfaceandpackage.entity;

interface Taxable {
	double salesTax = 0.07;
	double incomeTax = 0.105;
	
	void calcTax();
}