import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(10);  // ArrayList only handles objects;  this command is allowed because of auto boxing
		list.add(234);
		list.add(90);
		list.add(67);
		list.add(10);
		System.out.println("no "+list.size());
		System.out.println(list);
		
		list.add(2,2000); // add 2000 at index no. 2
		list.remove(0); // 0th index element
		list.remove(new Integer(90));
		System.out.println(list);
			
	}

}
