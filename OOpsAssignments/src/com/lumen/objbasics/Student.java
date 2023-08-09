package com.lumen.objbasics;

public class Student {
	String name;
	String department;
	//int[]marks;
	
	public Student(String name, String department) {
		this.name = name;
		this.department = department;
	}
	void printDetails() {
		System.out.println("Name "+name+" Department "+department);
	}
	String getGrades(int ...marks) {
		int sum=0,avg=0;
		String result="";
		for(int mark:marks)
		{
			sum=sum+mark;
			avg=sum/marks.length;
			if(avg>=90 && avg<=100) {
				result="A grade";
			}
			else if(avg>=80 && avg<=89) {
				result="B grade";
			}else if(avg>=70 && avg <=79) {
				result="C grade";
			}
			else if(avg>=60 && avg <=69) {
				result="D grade";
			}
			else if(avg>=50 && avg <=59) {
				result="E grade";
			}
			else {
				result="fail";
			}
		}
		
		return ("Sum is " +sum+" Average is "+avg+" Grade is "+result) ;
}
}
	
