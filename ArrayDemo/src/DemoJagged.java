
public class DemoJagged {
//jagged array is the arrays in which value for every column is different
	public static void main(String[] args) {
	
		String [] names = {"a", "b","c"};
		int [][] values= new int [3][];
	// have to define size for each column priorly
	values[0]=new int[4];
	values[1]=new int[2];
	values[2]=new int[5];
	
	values[0][0]=123;
	values[0][1]=135;
	values[0][2]=164;
	values[0][3]=121;
	
	values[1][0]=241;
	values[1][1]=215;
	
	values[2][0]=343;
	values[2][1]=354;
	values[2][4]=312;


for(int[] arr :values)
{
	for(int v :arr)
	{
		System.out.print(v+"	");
	}
	System.out.println();
}
} }