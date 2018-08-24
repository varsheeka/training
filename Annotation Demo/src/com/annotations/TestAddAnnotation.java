package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAddAnnotation {
	@AddAnnotation(number1=3, number2=5)
	public static void display() {
		System.out.println("hey");
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		TestAddAnnotation test = new TestAddAnnotation();
		Class class1 = test.getClass();
		
		Method[] methods = class1.getMethods();
		for(Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			
			for(Annotation anno : annotations) {
				if(anno.annotationType().equals(AddAnnotation.class))
				{
					AddAnnotation m =(AddAnnotation)anno;
					int x = m.number1();
					int y = m.number2();
					System.out.println(x+y);
				}
			}
		}
	}
}
