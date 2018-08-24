package com.myabstract;

public abstract class Shape {

	private String name;
	
	public Shape() {
		name="no name";
	}
	
	public Shape(String name) {
		super();
		this.name=name;
	}
	
	public void description() {
		System.out.println("name: "+name);
	}
	abstract public double area(); 
	
	/* the method is abstract here as it doesn't have a definition. hence need to have modifier as abstract instead of
	   access_specifier
   	   for abstract class reference an be created but NOT object 
       abstract methods can be declared ONLY by abstract class */
	
	// data holding class - extension
	// business logic - implementation: i.e for multiple inheritance
}
