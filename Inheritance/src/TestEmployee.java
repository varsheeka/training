import java.util.Scanner;

import com.pojo.Employee;


public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("Enter Id");
		int empId = s.nextInt();
		System.out.println("Enter salary");
		int Salary = s.nextInt();
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Enter name");
		String name = s.next();
		Employee emp=new Employee(empId,Salary,age,name); */
		//emp.display();
		Employee emp=new Employee(123, 3433, 23, "fed");
		System.out.println(emp);
	// printing an object is equivalent to invoking it's toString();	
	}

}
