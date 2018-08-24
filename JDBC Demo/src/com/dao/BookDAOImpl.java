package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.connections.MyConnection;

public class BookDAOImpl implements BookDAO {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		String INSERT_BOOK="insert into book values(?,?,?,?)";
		int r=0;
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_BOOK);
			
			ps.setString(1, book.getIsbn()); // number is the order of the question mark
			ps.setString(2, book.getName());
			ps.setString(3, book.getPublication());
			ps.setString(4, book.getauthor());
			r=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(r>0)
			return true;
		else
			return false;
	}

	@Override
	public int UpdateBook(Book book, String ISBN) {
		// TODO Auto-generated method stub
		//Book bookl = new Book();
		int row =0;
		String UPDATE_BOOK="update book set author=? where isbn=?";
		try {
			PreparedStatement ps=MyConnection.getMyConnection().prepareStatement(UPDATE_BOOK);
			ps.setString(1, book.getauthor());
			ps.setString(2, ISBN);
			
			row=ps.executeUpdate();
//			if(row>0)
//			{
//				bookl=findBookByISBN(ISBN);
//			}
//			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		String Delete_By_ISBN="delete * from book where isbn=?";
		PreparedStatement ps;
		int row=0;
		try {
			ps = MyConnection.getMyConnection().prepareStatement(Delete_By_ISBN);
			ps.setString(1, ISBN);
			
			row = ps.executeUpdate();} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return row;
	}

	@Override
	public Book findBookByISBN(String ISBN) {
		// TODO Auto-generated method stub
		Book book = new Book();
		String Find_By_ISBN="select * from book where isbn=?";
		PreparedStatement ps;
		try {
			ps = MyConnection.getMyConnection().prepareStatement(Find_By_ISBN);
			ps.setString(1, ISBN);
			
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				//emp=new Employee(set.getInt(1), set.getInt(3), set.getString(2));
				book=new Book(set.getString("isbn"), set.getString("name"), set.getString("publication"), set.getString("author"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return book;
		
	}

	@Override
	public List<Book> findBooksByName(String Name) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<>();
		String FIND_By_NAME="select * from book where name=?";
		PreparedStatement ps;
		Book book = new Book();
		
		try {
			ps = MyConnection.getMyConnection().prepareStatement(FIND_By_NAME);
			ps.setString(1, Name);
			
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				book=new Book(set.getString("isbn"), set.getString("name"), set.getString("publication"), set.getString("author"));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<>();
		String FIND_ALL_BOOKS="select * from book";
		
		try {
			Statement st=MyConnection.getMyConnection().createStatement();
			ResultSet set= st.executeQuery(FIND_ALL_BOOKS);
			while(set.next())
			{
				String ISBN=set.getString(1);
				String name=set.getString(2);	
				String publication = set.getString(3);
				String author = set.getString(4);
				System.out.println(ISBN+" "+name);
				Book book = new Book(ISBN, name,publication, author);
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
		
	}

	@Override
	public List<Book> findBooksByAuthor(String auth_name) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<>();
		String FIND_By_Author="select * from book where author=?";
		PreparedStatement ps;
		Book book = new Book();
		
		try {
			ps = MyConnection.getMyConnection().prepareStatement(FIND_By_Author);
			ps.setString(1, auth_name);
			
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				book=new Book(set.getString("isbn"), set.getString("name"), set.getString("publication"), set.getString("author"));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

}
