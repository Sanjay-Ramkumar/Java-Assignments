package com.bookapp.service;
import com.bookapp.model.*;

import java.sql.SQLException;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;

public interface IBookService {
	void addBook(Book book);
	void updateBook(int bookId,double price);
	void deleteBook(int bookId);
	List<Book>getAll();
	List<Book>getByAuthorContains(String author);
	List<Book>getBycategory(String category);
	List<Book>getByPricelessThan(double price);
	List<Book>getByAuthorContainsAndCategory(String author,String category);
	Book getById(int bookId);
}
