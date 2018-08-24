package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Stud;
		Scanner s= new Scanner(System.in);
		System.out.println("enter name");
		String name = s.next();
		int[] marks = new int[3];
		System.out.println("enter 3 marks");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		System.out.println("enter roll no");
		int rollno=s.nextInt();
		
		marks[0]=m1;
		marks[1]=m2;
		marks[2]=m3;
		
		Stud = new Student(name,marks,rollno);
		Stud.display();
		s.close();	
	}

}
