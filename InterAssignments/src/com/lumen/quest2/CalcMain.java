package com.lumen.quest2;

public class CalcMain {

	public static void main(String[] args) {
		BasicCalculator basicCalculator=new Basic();
		basicCalculator.add(10, 20);
		basicCalculator.difference(10, 20);
		basicCalculator.product(10, 20);
		basicCalculator.divide(10, 20);
		ScientificCalculator scientificCalculator=new Scientific();
		scientificCalculator.square(5);
		scientificCalculator.cube(5);
	}

}
