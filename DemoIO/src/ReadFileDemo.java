import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("abc.txt");
			byte value=0;
			do
			{
				int data = reader.read();		
				System.out.print((char)data);
				value=(byte)data;	
			}while(value!=-1);// no EOF in Java
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
