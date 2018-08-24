import com.myabstract.Circle;
import com.myabstract.Shape;

public class TestCircle {
	public static void main(String[] args) {
		Shape s = new Circle(4, "circle");
		double a =s.area();
		System.out.println("area: " + a);
		s.description();
	}
}
