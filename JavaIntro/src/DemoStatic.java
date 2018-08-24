
public class DemoStatic {

	private float age;
	private String name;
	
	private static int value; 
	
	public DemoStatic() {
		age=12.12f;
		name="abcd";
		value++;
		}
	// static block is not a fnc.. it's just a block of statements together
	static {
		value=0;
	}
	
	public void display()
	{
		System.out.println(name+age+value);
	}
	
	public static void show()
	{
		System.out.println(value);
	}

	public static void main(String[] args) {
		DemoStatic.show();
		
		DemoStatic d=new DemoStatic();
		DemoStatic d1=new DemoStatic();
		DemoStatic d2=new DemoStatic();
		DemoStatic d3=new DemoStatic();
		
		d2.show();
	}
// non-static fnc can access static data
// static fnc CANNOT access non-static data

}
