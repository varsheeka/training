import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*try {
			System.out.println("Enter Name: ");
			String name=br.readLine();
			System.out.println("You Entered: "+ name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		
		int a,b;
		try {
			System.out.println("Enter first num: ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter Second num: ");
			b = Integer.parseInt(br.readLine());
			System.out.println("Max = "+Math.max(a, b));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
}
