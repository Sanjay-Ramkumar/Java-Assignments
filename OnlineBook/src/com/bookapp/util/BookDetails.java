package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book>showBooks(){
		return Arrays.asList(
				new Book("Java in action","John david","tech",1,900.90),
				new Book("5 am club","Robin Sharma","selfhelp",2,2300.68),
				new Book("HTML for dummies","Ben John","tech",3,900.90),
				new Book("Spring for Beginners","John cena","tech",4,1900.30),
			    new Book("Fitness Guide","Roman Reigns","selfhelp",5,300.90));
	}
}
