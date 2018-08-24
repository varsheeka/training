import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoNavigableSet {

	public static void main(String[] args) {
		
		NavigableSet<String> set =new TreeSet();
		
		set.add("India");
		set.add("Sri Lanka");
		set.add("Germany");
		set.add("USA");
		
		System.out.println(set);
		
		System.out.println(set.headSet("India", true));
		System.out.println(set.tailSet("Sri Lanka", true));
	}
}
