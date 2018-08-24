import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookIO;
import com.interfaces.BookOperations;



public class DemoArrayListFile implements BookIO, BookOperations {
	
	List<Book> books = new ArrayList<Book>();

	public boolean writeDataToFile(List<Book>books)	{
		
		try {
			FileOutputStream fo = new FileOutputStream("books.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(books);
			oo.close();
			fo.close();
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Book> readDataFromFile()	{
		
		try {
			FileInputStream fi = new FileInputStream("books.txt");
			ObjectInputStream oi =new ObjectInputStream(fi);
			Object obj = oi.readObject();
			List<Book> books = (List<Book>)obj;
			oi.close();
			fi.close();
			return books;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		File file = new File("books.txt");
		if(file.exists()) {
			books=readDataFromFile();
			books.add(book);
			writeDataToFile(books);
		}
		else {
			try {
				file.createNewFile();
				books.add(book);
				writeDataToFile(books);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return 1;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printBook(List<Book> books) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printBook(Book book) {
		// TODO Auto-generated method stub

	}

}
