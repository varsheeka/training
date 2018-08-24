
public class Demo2D {

	public static void main(String[] args)
	{
		int [][] arrays = new int[3][3];
		
		arrays[0][0]=1;
		arrays[0][1]=2;
		arrays[0][2]=3;
		
		arrays[1][0]=11;
		arrays[1][1]=12;
		arrays[1][2]=13;
		
		arrays[2][0]=21;
		arrays[2][1]=22;
		arrays[2][2]=23;
		
		for(int i=0;i<arrays.length;i++)
		{
			for (int j=0;j<arrays[0].length;j++)
			{
				System.out.print(arrays[i][j]+"	");
			}
			System.out.println();
		}
	}
	
}
