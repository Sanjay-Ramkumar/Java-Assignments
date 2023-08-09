package com.lumen.objbasics;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println("Enter department");
		String department=scanner.next();
		int marks[]=new int[5];
		System.out.println("Enter marks");
		for(int i=0;i<5;i++) {
			marks[i]=scanner.nextInt();
		}
		Student student=new Student(name,department);
		student.printDetails();
		System.out.println(student.getGrades(marks));
		System.out.println("Enter name");
		String name1=scanner.next();
		System.out.println("Enter department");
		String department1=scanner.next();
		int marks1[]=new int[5];
		System.out.println("Enter marks");
		for(int i=0;i<5;i++) {
			marks1[i]=scanner.nextInt();
		}
		Student student1=new Student(name1,department1);
		student1.printDetails();
		System.out.println(student1.getGrades(marks1));
	}
}


