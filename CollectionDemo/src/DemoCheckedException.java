import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try (FileInputStream fi = new FileInputStream("abc.txt");) {
			ObjectInputStream oi = new ObjectInputStream(fi);
			oi.readObject();
			
		} catch (IOException|ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
