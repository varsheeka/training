package com.one;

public class MyClass {

	public void display()
	{
		System.out.println("displaying MyClass");
	}
	public void useDisplay() {
		display(); // doesn't need object creation to invoke as definition present in the same class
	}
}
