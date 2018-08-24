package com.pojo;

public class Employee extends Person {
	private double empSalary;
	private int empId;
	
	public Employee() {
		empId=0;
		empSalary=1000;
	}
	public Employee(int empId, double empSalary, int age, String name)
	{
		super(age,name); // invoke parent constructor
		this.empId=empId;
		this.empSalary=empSalary;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void display() {
		super.display(); // by default display would be equivalent to this.display();
		System.out.println(empId + "  " + empSalary);
		//System.out.println("name: "+ getName());
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+  "  " + empId+" "+empSalary;
	}
	
	public void display(int x) {
		super.display();
		System.out.println(empId+"  " + empSalary);
	}
}
