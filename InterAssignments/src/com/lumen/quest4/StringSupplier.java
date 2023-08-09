package com.lumen.quest4;

import java.util.Scanner;
import java.util.function.Supplier;

public class StringSupplier {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scanner.next();
		Supplier<String> supplier=()->name.toUpperCase();
		String result=supplier.get();
		System.out.println(result);
	}

}
 