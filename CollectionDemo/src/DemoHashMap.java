import java.util.Map;
import java.util.Set;

import com.beans.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import com.interfaces.*;

public class DemoHashMap {

//	public static void main(String[] args) {
//		Book book = new Book();
//		BookIOImpl b = new BookIOImpl();
//		Map<String, Book> m = new HashMap<>();
//		m.put("Citi", book);
//		m.put("GS", new Book());
//		m.put("MS", b.getBook());
//		m.put("JP", book);
//		
////		System.out.println(m);
//		
//		Set<Entry<String, Book>> entries = m.entrySet();
//		Iterator<Entry<String, Book>> iterator = entries.iterator();
//		while(iterator.hasNext())
//		{
//			Entry<String, Book> entry=iterator.next();
//			System.out.println(entry.getKey()+": "+entry.getValue());
//		}
//	}
	
	public static void main(String[] args) {
		
		Map<String, List<Book>> m = new HashMap<>();
		List<Book> books_java = new ArrayList<>();
		books_java.add(new Book(1, "java1", "Oracle", 100d));
		books_java.add(new Book(12, "java2", "Oracle", 200d));
		books_java.add(new Book(67, "adv java1", "Oracle", 100d));
		m.put("Java", books_java);
		
		List<Book> books_dotNet = new ArrayList<>();
		books_dotNet.add(new Book(1, ".net 1", "MS", 100d));
		books_dotNet.add(new Book(12, ".net 2", "MS", 200d));
		books_dotNet.add(new Book(67, "C#", "MS", 100d));
		m.put("dotNet", books_dotNet);
		
		List<Book> books_stories = new ArrayList<>();
		books_stories.add(new Book(1, "Ramayana", "publi1", 100d));
		books_stories.add(new Book(12, "Mahabharata", "publi2", 200d));
		m.put("Stories", books_stories);
		
//		System.out.println(m);
		
		Set<Entry<String, List<Book>>> entries = m.entrySet();
		Iterator<Entry<String, List<Book>>> iterator = entries.iterator();
		while(iterator.hasNext())
		{
			Entry<String, List<Book>> entry=iterator.next();
			System.out.println("Category: "+entry.getKey());
			List<Book> books = entry.getValue();
			for(Book book:books)
			{
				System.out.println(book.getName()+" "+book.getIsbn());
			}
		}
	}
}
