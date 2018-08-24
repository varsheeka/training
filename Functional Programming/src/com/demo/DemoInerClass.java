package com.demo;

public class DemoInerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface m = new MyInterface() {
			
			@Override
			public void showData() {
				
				System.out.println("hey from inner class ;)");
			}
		};
		m.showData();
	}

}
