package com.lumen.objbasics;

public class Book {
	String title;
	String author;
	double price;
	String category;
	public Book(String title, String author, double price, String category) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	void getDetails() {
		System.out.println("Title "+title+" Author "+author+" price "+price
				+" category "+category);
	}
	void checkBookType() {
		if(price>500)
			System.out.println("Premium book");
		else
			System.out.println("Standard book");
	}
	
}
