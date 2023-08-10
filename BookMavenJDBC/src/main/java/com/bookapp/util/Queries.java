package com.bookapp.util;

public class Queries {
	public static final String CREATEQUERY="create table if not exists book(title varchar(30),bookId int primary key,author varchar(30),category varchar(30),price double)";
	public static final String INSERTQUERY="Insert into book(title,bookId,author,category,price)values(?,?,?,?,?)";
	public static final String UPDATEQUERY="Update book SET price=? where bookId=?";
	public static final String DELETEQUERY="Delete from book where bookId=?";
	public static final String QUERYALL="Select * from book";
	public static final String QUERYBYAUTHOR="Select * from book where author LIKE ?";
	public static final String QUERYBYCATEGORY="Select * from book where category=?";
	public static final String QUERYBYPRICELESSTHAN="Select * from book where price<?";
	public static final String QUERYBYAUTHORANDCATEGORY="Select * from book where author LIKE ? && category=?";
	public static final String QUERYBYBOOKID="Select * from  book where bookId=?";
}
