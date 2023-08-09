package com.bookapp.service;
import com.bookapp.model.*;

import java.util.ArrayList;
import java.util.List;

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
		List<Book>booksByAuthor=new ArrayList<Book>();
		for(Book book:books) {
			if(book.getAuthor().contains(author)) {
				booksByAuthor.add(book);
		}
		}if(booksByAuthor.isEmpty())
		{
			throw new BookNotFoundException("List does not have any books with the given author");
		}
		return booksByAuthor;
	}

	@Override
	public List<Book> getBycategory(String category) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>bookByCategory=new ArrayList<Book>();
		for(Book book:books) {
			if(book.getCategory().equals(category)) {
				bookByCategory.add(book);
			}
		}
		if(bookByCategory.isEmpty())
		{
			throw new BookNotFoundException("List does not have any books with the given category");
		}
		return bookByCategory;
	}

	@Override
	public List<Book> getByPricelessThan(double price) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>bookByPrices=new ArrayList<Book>();
		for(Book book:books) {
			if((Double)book.getPrice()<price) {
				bookByPrices.add(book);
			}
		}
			if(bookByPrices.isEmpty()){
				throw new BookNotFoundException("List does not have any books with the price lesser");
			}
		return bookByPrices;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>booksByAuthorAndCategory=new ArrayList<Book>();
		for(Book book:books) {
			if((book.getAuthor().contains(author))&& (book.getCategory().equals(category))) {
				booksByAuthorAndCategory.add(book);
				}
		}
		if(booksByAuthorAndCategory.isEmpty())
			{
				throw new BookNotFoundException("List does not have any books with the given auhtor and category");
			}
		return booksByAuthorAndCategory;
	}
	
	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		for(Book book:books) {
			if((Integer)book.getBookId()==bookId) {
				return book;
			}
		}
		throw new BookNotFoundException("List does not have any books with the price lesser");
	}

}
