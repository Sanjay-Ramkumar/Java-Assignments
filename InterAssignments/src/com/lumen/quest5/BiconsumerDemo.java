package com.lumen.quest5;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiconsumerDemo {
	public static void main(String args[]) {
		BiConsumer<String , Integer> biConsumer=(name,age)->{
			if(name.equals("Admin") && age>30) {
				System.out.println("Welcome user");
			}
			else {
				System.out.println("Wrong user");
			}
		};
		biConsumer.accept("Admin", 40);
	}
}
