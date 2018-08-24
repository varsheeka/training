package com.demo;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("hi ;p");
	}
	
	public static void main(String[] args) {
		MyInterface m = new MyInterfaceImpl();
		m.showData();
	}

}
