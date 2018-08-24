package com.pojo;
//plain old java object

public class Student {

private String name;
private int[] marks;
private int rollno;
public Student() {
	name = "John Doe";
	marks=new int[3];
	marks[0]=0;marks[1]=0;marks[2]=0;
	rollno=123456;
}

public Student(String name, int[] marks, int rollno) {
	this.name=name;
	this.marks=marks;
	this.rollno=rollno;
}

public void display() {
	System.out.println("Name: " +name);
	System.out.println("Marks: " +marks[0]+","+marks[1]+","+marks[2]);
	System.out.println("Rollno: " +rollno);
}
}
