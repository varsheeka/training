package com.demo;

public class DemoLambda1 {

	public static void main(String[] args) {
		
		MyInterface1 m = (p1,p2) -> {return p1.getAge()==p2.getAge();};
		System.out.println(m.add(new Person(), new Person()));
		
		
	}
}
