package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.DBConnection;
import com.bookapp.util.Queries;

public class BookDaoImpl implements IBookDao {

	@Override
	public void addBook(Book book) {
		try (Connection connection = DBConnection.openConnection();
			 PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);) {
			statement.setString(1, book.getTitle());
			statement.setInt(2, book.getBookId());
			statement.setString(3, book.getAuthor());
			statement.setString(4, book.getCategory());
			statement.setDouble(5, book.getPrice());
			statement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBook(int bookId, double price) {
		try (Connection connection = DBConnection.openConnection();
			PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);) {
			statement.setDouble(1, price);
			statement.setInt(2, bookId);
			statement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteBook(int bookId) {
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);) {
			statement.setInt(1, bookId);
			statement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Book> findAll(){
		List<Book> books = new ArrayList<Book>();
		//ResultSet result = statement.executeQuery();
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYALL);) {
				ResultSet result = statement.executeQuery();
			
			while (result.next()) {
				Book book = new Book();
				book.setTitle(result.getString(1));
				book.setBookId(result.getInt(2));
				book.setAuthor(result.getString(3));
				book.setCategory(result.getString(4));
				book.setPrice(result.getDouble(5));
				books.add(book);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {

		List<Book> books = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYAUTHOR);) {
			statement.setString(1, "%"+author+"%");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Book book = new Book();
				book.setTitle(result.getString(1));
				book.setBookId(result.getInt(2));
				book.setAuthor(result.getString(3));
				book.setCategory(result.getString(4));
				book.setPrice(result.getDouble(5));
				books.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException{
		List<Book> books = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYCATEGORY);) {
			statement.setString(1, category);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Book book = new Book();
				book.setTitle(result.getString(1));
				book.setBookId(result.getInt(2));
				book.setAuthor(result.getString(3));
				book.setCategory(result.getString(4));
				book.setPrice(result.getDouble(5));
				books.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYPRICELESSTHAN);) {
			statement.setDouble(1, price);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Book book = new Book();
				book.setTitle(result.getString(1));
				book.setBookId(result.getInt(2));
				book.setAuthor(result.getString(3));
				book.setCategory(result.getString(4));
				book.setPrice(result.getDouble(5));
				books.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public List<Book> findByAuthorContainsAndCategory(String author, String category)
			throws BookNotFoundException {
		List<Book> books = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYAUTHORANDCATEGORY);) {
			statement.setString(1, author);
			statement.setString(2, category);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Book book = new Book();
				book.setTitle(result.getString(1));
				book.setBookId(result.getInt(2));
				book.setAuthor(result.getString(3));
				book.setCategory(result.getString(4));
				book.setPrice(result.getDouble(5));
				books.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book findById(int bookId) throws BookNotFoundException {
		Book book = null;
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYBOOKID);) {
			statement.setInt(1, bookId);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				book = new Book();
				book.setTitle(result.getString(1));
				book.setBookId(result.getInt(2));
				book.setAuthor(result.getString(3));
				book.setCategory(result.getString(4));
				book.setPrice(result.getDouble(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

}
