
public class DemoWhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12,34,44,54,34,55,65,78,90,23,90};
		int i=0;
		while(i<11)
		{
			System.out.print(array[i]+" ");
			i++;
		} i=0;
		System.out.println();
		do {
			System.out.print(array[i]+" ");
			i++;
		}while(i<11);
	System.out.println();
		i=0;
	int search=54;

	boolean flag=false;
	while(i<array.length) {
		if(array[i]==search)
			flag = true;
		i++;
	}
	if(flag)
	{
		System.out.println("value found");
	}
	else
	{
		System.out.println("Value NOT found");
	}
		
	 
	}
}

