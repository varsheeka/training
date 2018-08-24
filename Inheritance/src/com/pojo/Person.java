package com.pojo;

public class Person {

	private int age;
	private String name;

	// access_sp return_type func_name() {  }
	public void display() {
		System.out.println("name:-"+name+"\t"+"age:-"+age);
	}
	
	public Person()
	{
		age=21;
		name="David";
	}
	
	public Person(int age, String name)
	{
		this.age=age; this.name=name;
	}
	
	//public void setDatamember(data_type name) : mutator functions 
	public void setAge(int a)
	{
		age =a;
	}
	// local scope, object scope, class scope

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj; // down casting 
		
		return (p.name.equals(name) && p.age == this.age);
	}

}