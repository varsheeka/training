
public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee myEmployee=new Employee(5, 45330, "boo");
		EmployeeDAO dao = new EmployeeDAO();
		int rows=dao.addEmployee(myEmployee);
		if(rows>0)
		{
			System.out.println("success");
		}
		else
			System.out.println("fail");
	}

}
