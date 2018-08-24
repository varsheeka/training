
public class TestPerson {

	public static void main(String[] args) {
		// cls_name ref_name (declaration)
		Person p; // p is reference to object of type Person 
		// ref_name = new cls_name; (definition) - memory alloaction 
		p=new Person(); // if new isn't used - stack memory would be used else heap memory
		
		// ref_name.func_name();
		//p.setValues();
		p.display();
		
		p=new Person(123,"abcd");
				p.display();
		// func overloading, same num , diff signaures - no, datatype and sequence of arguments 
		// reference reinitialisation - reference would point to the latest assigned
		p.setAge(1000);
		p.display();
	}

}
