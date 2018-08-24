import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Id");
		int empId = s.nextInt();
		System.out.println("Enter salary");
		int Salary = s.nextInt();
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Enter name");
		String name = s.next();
		Employee emp=new Employee(empId,Salary,age,name);
		s.close();
		return emp;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee.display();
	}

	
}
