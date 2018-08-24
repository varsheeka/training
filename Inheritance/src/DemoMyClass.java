import java.util.Scanner;

import com.pojo.Employee;

public class DemoMyClass {

	public static void main(String[] args) {
		
		EmployeeIO empIO= new EmployeeIO() {

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
			// anonymous inner class... using a class that is implementing a interface who's name we didn't mentioned
		
		
		};
	Employee emp=empIO.readEmployee();
	empIO.writeEmployee(emp);
	}
}
// can't reuse as we don't have the class. Class within a method - method local inner class (anonymous inner class here)