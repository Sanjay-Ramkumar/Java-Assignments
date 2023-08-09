package com.lumen.quest1;

public class CalcMain {

	public static void main(String[] args) {
		Calculator addition=(x,y)->System.out.println("Addition " +(x+y));
		addition.calculate(10,20);
		Calculator subtraction=(x,y)->System.out.println("Subtraction " +(x-y));
		subtraction.calculate(10,20);
		Calculator multiplication=(x,y)->System.out.println("Multiplication " +(x*y));
		multiplication.calculate(10,20);
		Calculator division=(x,y)->System.out.println("division " +(x/y));
		division.calculate(10,20);
		
	}

}
