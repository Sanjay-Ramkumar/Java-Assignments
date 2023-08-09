package com.bookapp.client;

import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String author=scanner.next();
		String category=scanner.next();
		double price=scanner.nextDouble();
		int bookid=scanner.nextInt();
		IBookService bookService=new BookServiceImpl();
		System.out.println("Books by author");
		bookService.getByAuthorContains(author).forEach(System.out::println);
		System.out.println("Books by Category");
		bookService.getBycategory(category).forEach(System.out::println);;
		System.out.println("Books by price");
		bookService.getByPricelessThan(price).forEach(System.out::println);;
		System.out.println("Books by author and Category");
		bookService.getByAuthorContainsAndCategory(author,category).forEach(System.out::println);;
	    System.out.println("Books by id");
	    Book book= bookService.getById(bookid);
	    System.out.println((book));
	    
	}

}
