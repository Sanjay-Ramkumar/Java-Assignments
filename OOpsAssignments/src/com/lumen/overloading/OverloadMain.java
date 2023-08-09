package com.lumen.overloading;
import java.util.Scanner;
public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		String designation=scanner.next();
		Employee employee=new Employee(name,designation);
		Employee employee1=new Employee(name,designation);
		Employee employee2=new Employee(name,designation);
		if(designation.equals("Programmer")) {
			System.out.println(employee.calcBonus(10.0));
		}else if(designation.equals("Manager")) {
			System.out.println(employee.calcBonus(10.0,20.0));
		}
		else {
			System.out.println(employee.calcBonus(10.0,20.0,30.0));
		}
		
	}

}
