import com.pojo.Employee;
import com.pojo.Person;

public class DemoPolymorphism {
	public static void main(String[] args) {
		Person e = new Employee();
		((Employee)e).display(12);
	}
}
