package com.lumen.quest2;

public class Basic implements BasicCalculator{

	@Override
	public void add(int x, int y) {
		System.out.println("Sum "+x+y);
	}

	@Override
	public void difference(int x, int y) {
		System.out.println("Difference "+(x-y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println("product "+(x*y));
	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Division "+(x/y));
	}

}
