package com.abstarctclass.main;

import com.abstarctclass.entity.*;

public class TestProcessor {

	public static void main(String[] args) {
		Processor f = new Factorial(5);
		Processor c = new Circle(10);
		f.process();
		c.process();
	}

}
