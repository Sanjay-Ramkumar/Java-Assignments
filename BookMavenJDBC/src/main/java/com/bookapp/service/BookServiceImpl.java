package com.bookapp.service;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookDao;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImpl implements IBookService {
	IBookDao bookDao=new BookDaoImpl();
	@Override
	public List<Book> getAll(){
			return bookDao.findAll().stream()
					.sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList());
	}
	@Override
	public List<Book> getByAuthorContains(String author) {
			List<Book> books= bookDao.findByAuthorContains(author);
			if(books.isEmpty()){
				throw new BookNotFoundException("Books by the give author name is not found");
			}
			return books.stream()
					.sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList());
	}

	@Override
	public List<Book> getBycategory(String category){
			if(bookDao.findByCategory(category).isEmpty()) {
				throw new BookNotFoundException("Books by the given category does not exist");
			}
			return bookDao.findByCategory(category).stream()
					.sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList());
	}

	@Override
	public List<Book> getByPricelessThan(double price){
			if(bookDao.findByPriceLessThan(price).isEmpty()) {
				throw new BookNotFoundException("Books with price less than the given price does not exist");
			}
			return bookDao.findByPriceLessThan(price).stream()
					.sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList());
		}
	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category){
			if(bookDao.findByAuthorContainsAndCategory(author,category).isEmpty()) {
				throw new BookNotFoundException("Books with the given author name and category does not exist");
			}
			return bookDao.findByAuthorContainsAndCategory(author,category).stream()
					.sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList());
		
	}

	@Override
	public Book getById(int bookId) {
			if(bookDao.findById(bookId)==null) {
				throw new BookNotFoundException("Book with the given ID does not exist");
			}
			return bookDao.findById(bookId);
	}

	@Override
	public void addBook(Book book) {
			bookDao.addBook(book);
	}

	@Override
	public void updateBook(int bookId, double price) {
			bookDao.updateBook(bookId,price);
	}

	@Override
	public void deleteBook(int bookId) {
			bookDao.deleteBook(bookId);
}
}
