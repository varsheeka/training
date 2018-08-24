package com.exceptions;

import java.io.PrintStream;

public class MyException extends Exception {
	private String message;
	
	public MyException() {
		// TODO Auto-generated constructor stub
		message="lol";
	}

	
	
	public MyException(String message) {
		super(message);
		this.message = message;
	}



	public void showCause()
	{
		System.out.println("xyz exception");
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println("my msg");
	}
	
}
