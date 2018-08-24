package com.beans;

public class Book implements Comparable<Book> {
	private String isbn;
	private String name;
	private String publication;
	private String author;
	
	public Book() {
		isbn="34";
		name="Java";
		publication="Pearson";
		//author=345.64d;
		author="Rowlings :p";
	}
	 
	@Override
	public boolean equals(Object obj) {
		Book b=(Book)obj;
		return this.isbn==b.isbn && this.name.equals(b.name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publication=" + publication + ", author=" + author + "]";
	}

	public Book(String isbn, String name, String publication, String author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publication = publication;
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		this.author = author;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
