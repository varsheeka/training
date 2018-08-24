import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.interfaces.BookOperationsImpl;
import com.interfaces.BookIOImpl;;

public class DemoBookOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		Book book = new Book();
		BookOperationsImpl bookimpl =new BookOperationsImpl(books);
		BookIOImpl bookio = new BookIOImpl();
		//String c;
		int a;
		do {
		Scanner s = new Scanner(System.in);
		System.out.println("Menu");		
		System.out.println("1. add");
		System.out.println("2.update");
		System.out.println("3.find by id");
		System.out.println("0 exit");
		System.out.println("Enter choice");
		a = s.nextInt();
		
		
		switch(a) {
		case 1: 
		{
			book = bookio.getBook();
			int isbn = bookimpl.addBook(book);
			System.out.println(isbn);
			break;
		}
		case 2:
		{
			System.out.println("Enter Isbn");
			Book b = new Book();
			b.setIsbn(s.nextInt());
			System.out.println(bookimpl.deleteBook(b));
		}
		case 3:
		{
			System.out.println("Enter Isbn");
			Book b = new Book();
			b.setIsbn(s.nextInt());
			System.out.println(bookimpl.findBookById(b));
			break;
		}
		}
//System.out.println("Do you want to continue y/n ");
//c = s.next();
		} while(a!=0);
	}

}
