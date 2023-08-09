package com.bookapp.service;
import com.bookapp.model.*;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;

public interface IBookService {
	List<Book>getAll();
	List<Book>getByAuthorContains(String author) throws BookNotFoundException;
	List<Book>getBycategory(String category) throws BookNotFoundException;
	List<Book>getByPricelessThan(double price) throws BookNotFoundException;
	List<Book>getByAuthorContainsAndCategory(String author,String category) throws BookNotFoundException;
	Book getById(int bookId)throws BookNotFoundException;
}
