package com.interfaces;

import java.util.List;
import java.util.Scanner;

import com.beans.Book;

public class BookIOImpl implements BookIO{

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		Book b = new Book();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter isbn");
		b.setIsbn(s.nextInt());
		System.out.println("Enter name");
		b.setName(s.next());
		System.out.println("Enter publication");
		b.setPublication(s.next());
		System.out.println("Enter Price");
		b.setPrice(s.nextDouble());
		
		return b;
	}

	@Override
	public void printBook(List<Book> books) {
		// TODO Auto-generated method stub
		for(Book b :books) {
			System.out.println(b);
		}
		
	}

	@Override
	public void printBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println(book);
	}

}
