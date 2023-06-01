package com.interfaceandpackage.entity;

public class Box {
	int width, height, depth;
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public void volume() {
		int volume = width*height*depth;
		System.out.println("Volume of bx is "+volume);
	}
}
