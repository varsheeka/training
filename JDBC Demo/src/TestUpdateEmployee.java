
public class TestUpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id_update=12;
		Employee emp =new Employee(1,9000,"citi");
		
		EmployeeDAO dao =new EmployeeDAO();
		Employee emp_udpated=dao.updateEmployee(id_update, emp);
		System.out.println(emp_udpated.getName()+": "+emp_udpated.getSalary()	);
	}

}
