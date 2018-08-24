import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.beans.Book;

public class DemoBookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book());
		books.add(new Book(52, "Grey", "House", 350d));
		books.add(new Book(56, "Darker", "House", 400d));
		books.add(new Book(52, "Grey", "House", 350d));
		
		System.out.println("Books: "+books.size());
		System.out.println(books);
		
		Book book_to_search= new Book(34, "Java", "Pearson", 345.64d);
		
		boolean removed=books.remove(book_to_search);
		System.out.println(removed);
		
		boolean found= books.contains(book_to_search);
		
		if(found)
			System.out.println("Avl");
		else
			System.out.println("nope");
		
		books.stream().filter(data -> {return data.getPrice()==350d;}).collect(Collectors.toList()).forEach(System.out::println);
	
	}
	}


