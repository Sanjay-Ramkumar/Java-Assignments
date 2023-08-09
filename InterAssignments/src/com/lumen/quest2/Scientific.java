package com.lumen.quest2;

public class Scientific extends Basic implements ScientificCalculator {

	@Override
	public void square(int x) {
		System.out.println("Square "+Math.pow(x, 2));
	}

	@Override
	public void cube(int x) {
		System.out.println("Square "+Math.pow(x, 3));
	}

}
