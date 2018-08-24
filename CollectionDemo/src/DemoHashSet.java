import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.beans.Book;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> books = new HashSet<Book>();
		
		books.add(new Book());
		books.add(new Book(52, "Grey", "House", 350d));
		books.add(new Book(56, "Darker", "House", 400d));
		books.add(new Book(52, "Grey", "House", 350d));
		books.add(new Book(52, "Freed", "House", 350d));
		
		System.out.println(books.size());
		Iterator<Book>  iterator = books.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		for(Book b :books) {
			System.out.println(b);
		}
	}

}
