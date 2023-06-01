package com.oops.main;

import com.oops.entity.Rectangle;

public class TestReactangle {

	public static void main(String[] args) {
		Rectangle[] rec = new Rectangle[2];
		rec[0] = new Rectangle(10,3);
		rec[1] = new Rectangle(20,5);
		
		for(int i=0;i<rec.length;i++) {
			System.out.println("Rectangle "+(i+1)+" Length: "+rec[i].getLength()+
					", Breadth: "+rec[i].getBreadth()+", Area: "+
					rec[i].getArea());
		}
	}

}
