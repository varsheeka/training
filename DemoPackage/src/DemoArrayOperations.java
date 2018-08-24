import java.util.Arrays;

public class DemoArrayOperations {
	public static void main(String[] args) {
		
		int[] numbers= {2346,84,76,4,34,24,65,24};
		int[] numbers1= {2346,84,76,	4,34,24,65,24};
		/*Arrays.fill(numbers, 0);
		
		for(int num: numbers) {
			System.out.print(num);
		} */
		
		Arrays.fill(numbers,1,3,1); // elements from 1 to <3 would be filled i.e 1,2 here
		System.out.println();
		for(int num:numbers)
		{
			System.out.print(num);
		}

	int[] arr_copy=Arrays.copyOf(numbers, 5); // copy first 5 elements
	System.out.println();
	for(int num:arr_copy)
	{
		System.out.print(num);
	}

	System.out.println(Arrays.equals(numbers,numbers1));
	
	
	}
}