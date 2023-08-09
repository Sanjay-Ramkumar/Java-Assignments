package com.lumen.quest3;
import java.util.function.BiConsumer;
public class addition {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> biconsumer=(number1,number2)->{
			System.out.println(number1+number2);
		};
		biconsumer.accept(10,20);
		
		
		
	}

}
