
public class DemoCommandLine 
{

	public static void main(String[] args) 
	{
		System.out.println("num of arguments"+args.length);
		//System.out.printlin("arguments: " + args[0]);
		for(String x:args) 
		{
			System.out.println(x);
		}
		 int sum=0; 
		for(String arg:args) {
			sum=sum+Integer.parseInt(arg);
		}
	}
}

/*
	Wrapper classes: to convert between data types
	this is not casting. not object into primitive.
	by default 8 primitive data types.. therefore 8 wrapper class. 
	static - property of a class. not property of an object.
	 
*/