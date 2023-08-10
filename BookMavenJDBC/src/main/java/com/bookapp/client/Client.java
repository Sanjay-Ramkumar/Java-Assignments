package com.bookapp.client;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		IBookService bookService=new BookServiceImpl();
		List<Book>boo=Arrays.asList(new Book("Leo","Sanjay","action",103,304.8),
				new Book("neon","jay","equalstion",104,308.8));
		List <Book>books;
		for(Book book:boo) {
			
			bookService.addBook(book);
		}
		bookService.deleteBook(101);
		
		books=bookService.getByAuthorContains("sanjay");
		System.out.println("Books by author");
		books.forEach(System.out::println);
		System.out.println();
		
		books=bookService.getBycategory("action");
		System.out.println("Books by Category");
		books.forEach(System.out::println);
		System.out.println();
		
		books=bookService.getByPricelessThan(400.0);
		System.out.println("Books by price");
		books.forEach(System.out::println);
		System.out.println();
		
		books=bookService.getByAuthorContainsAndCategory("Sanjay","action");
		System.out.println("Books by author and Category");
		books.forEach(System.out::println);
		
		Book book=bookService.getById(102);
	    System.out.println("Books by id");
	    System.out.println(book);
	    
	    bookService.updateBook(103, 500.0);
	    bookService.deleteBook(5);
	    books=bookService.getAll();
	    System.out.println("All Books");
	    books.forEach(System.out::println);
	    System.out.println();
	    
	}

}
