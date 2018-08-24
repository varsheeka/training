
public class Employee {

	private int empid, salary;
	private String name;
	 public Employee() {
		// TODO Auto-generated constructor stub
		 super();
	 }
	public Employee(int empid, int salary, String name) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
}
