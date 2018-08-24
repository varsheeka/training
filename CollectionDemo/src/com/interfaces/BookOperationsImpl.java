package com.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class BookOperationsImpl implements BookOperations{
	private List<Book> books = new ArrayList<Book>();
	Book bookl = null;
	public BookOperationsImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public BookOperationsImpl(List<Book> books) {
		super();
		this.books = books;
	}



	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		this.books.add(book);
		return book.getIsbn();
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		for(Book b: this.books)
		{
			if(b.getIsbn()==book.getIsbn())
				this.bookl=b;
				
		} 
		boolean removed = this.books.remove(this.bookl); 
		return removed;
	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		for(Book b: this.books)
		{
			if(b.getIsbn()==book.getIsbn())
				this.bookl=b;
				
		} 
		return this.bookl;
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		List<Book> b = new ArrayList<Book>();
		for(Book book:this.books)
		{
			if(book.getName()==book_name)
				b.add(book);
		}
		return b;
	}

}
