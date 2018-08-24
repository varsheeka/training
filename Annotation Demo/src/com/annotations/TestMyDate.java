package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestMyDate {

	@MyDate(date=3,month="Sept",year=2018)
	public static void display() {
		System.out.println("hey");
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		TestMyDate test = new TestMyDate();
		Class class1 = test.getClass();
		
		Method[] methods = class1.getMethods();
		for(Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			
			for(Annotation anno : annotations) {
				if(anno.annotationType().equals(MyDate.class))
				{
					MyDate m =(MyDate)anno;
					int day=m.date();
					System.out.println(day);
				}
			}
		}
	}
}