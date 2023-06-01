package com.interfaceandpackage.entity;

public class BoxWeight extends Box {
	public int weight;
	
	public BoxWeight(int weight, int width, int height, int depth) {
		super(width, height, depth);
		this.weight = weight;
	}
}
