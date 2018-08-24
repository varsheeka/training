import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("First name: ");
		String first = s.next();
		System.out.println("Last Name: ");
		String last = s.next();
		String name = first.concat(last);
		System.out.println(name);
		name = name.toLowerCase();
		System.out.println(name);
		name = name.toUpperCase();
		System.out.println(name);
		name=name.substring(2, 6);
		System.out.println(name);
		name = name.substring(2);
		System.out.println(name);
		s.close();
		}

}

// above we treated String as primitive while declaration as we didn't implicitly use 'new' keyword