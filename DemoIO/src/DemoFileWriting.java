import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {
	public static void main(String[] args) {
		
		FileWriter fileWr;
		try {
			fileWr = new FileWriter("abc.txt",true); // true for appending else data would get over written 
			fileWr.write("Citi,Pune");
			
			System.out.println("File created and data inserted");
			fileWr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
