import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;
import com.compare.MyComparator;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> books = new TreeSet<Book>(new MyComparator());
		books.add(new Book());
		books.add(new Book(52, "Grey", "House", 350d));
		books.add(new Book(56, "Darker", "House", 400d));
		books.add(new Book(52, "Freed", "House", 360d));
		
		System.out.println("Books: "+books.size());
		for(Book book:books) {
		System.out.println(book);}
	}

}
