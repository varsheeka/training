
public class Demo1D {

	public static void main(String[] args) {
		
		// data_type [] array_name;
		// array_name = variable name -> [reference to array] not [array]
		// array is always created in heap memory

		int[] numbers;
		numbers = new int[5];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=100;	
		numbers[3]=108;
		numbers[4]=4;
		
		for(int i=0; i<5; i++)
		{
			System.out.println(numbers[i]);
		}
		
		// enchanced for loop/for each loop
		//disadvantage - sequential execution; can't skip any element
		for(int x :numbers) {
			System.out.println(x);
		}
		
		int sum = add(numbers);
		System.out.println("sum of all elements = " + sum );
	}
		
		public static int add(int[] numbers) {
			return (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
		}
		
}
