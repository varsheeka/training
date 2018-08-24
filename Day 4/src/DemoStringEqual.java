
public class DemoStringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("citi");;
		String name1=new String("citi");
// when String is treated as primitive while declaring i.e 'new' isn't used while declaring. another string isn't created. the new reference too points to the same string in the string pool. but when you use 'new' to create the object then the output will be not equal.		
		if(name1==name)
			{System.out.println("equal");}
		else 
			{System.out.println("NOT equal");}
	}

}
