package com.bookapp.service;
import com.bookapp.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>booksByAuthor=books.stream().filter(book->book.getAuthor().contains(author)).toList();
		if(booksByAuthor.isEmpty())
		{
			throw new BookNotFoundException("List does not have any books with the given author");
		}
		return booksByAuthor;
	}

	@Override
	public List<Book> getBycategory(String category) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>bookByCategory=books.stream().filter(book->book.getCategory().equals(category)).toList();
		if(bookByCategory.isEmpty())
		{
			throw new BookNotFoundException("List does not have any books with the given category");
		}
		return bookByCategory;
	}

	@Override
	public List<Book> getByPricelessThan(double price) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>bookByPrices=books.stream().filter(book->book.getPrice()<price).toList();
		
			if(bookByPrices.isEmpty()){
				throw new BookNotFoundException("List does not have any books with the price lesser");
			}
		return bookByPrices;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>booksByAuthorAndCategory=books.stream().filter(book->(book.getAuthor().contains(author) && book.getCategory().equals(category))).toList();
		if(booksByAuthorAndCategory.isEmpty())
			{
				throw new BookNotFoundException("List does not have any books with the given auhtor and category");
			}
		return booksByAuthorAndCategory;
	}
	
	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		return books.stream().filter(book->book.getBookId()==bookId).findFirst().orElseThrow(()->new BookNotFoundException("List does not have any books with the given id"));
	}

}
