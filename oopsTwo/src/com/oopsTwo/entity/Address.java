package com.oopsTwo.entity;

public class Address {
	private String name, streetAddress, city, state;
	private int ZIPcode;
	
	public Address(String name, String streetAddress, 
			String city, String state, int ZIPcode) {
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.ZIPcode = ZIPcode;
	}
	public String getName() {
		return name;
	}
	public void printAddress() {
		System.out.println("Address: "+streetAddress+" city :"+city
				+" state: "+state+" ZIP Code: "+ZIPcode);
	}
}
