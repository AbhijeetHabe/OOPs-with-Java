package com.interfaceandpackage.main;

import com.interfaceandpackage.entity.*;

public class TestBox {

	public static void main(String[] args) {
		BoxWeight boxweight = new BoxWeight(10,20,30,40);
		boxweight.volume();
		System.out.println("Weight is "+boxweight.weight);
	}

}
