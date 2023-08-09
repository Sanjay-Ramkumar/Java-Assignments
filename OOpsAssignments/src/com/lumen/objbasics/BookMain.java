package com.lumen.objbasics;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("Goodnight","Siddharth",600,"thriller");
		book1.getDetails();
		book1.checkBookType();
		Book book2=new Book("Tucker","Vijay",300,"Comedy");
		book2.getDetails();
		book2.checkBookType();
		
	}

}
