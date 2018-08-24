package com.dao;

import java.util.List;

import com.beans.*;

public interface BookDAO {

	boolean addBook(Book book);
	int UpdateBook(Book book, String ISBN);
	int deleteBook(String ISBN);
	Book findBookByISBN(String ISBN);
	List<Book>findBooksByName(String Name);
	List<Book>findAllBooks();
	List<Book>findBooksByAuthor(String auth_name);
	
}
