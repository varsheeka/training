package com.demo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<>();
		l.add("ABC");
		l.add("XYZ");
		l.add("C");
		l.add("LMN");
		l.add("C");
		/*l.add(new Double(23.45d));
		l.add(new Object());
		l.add(new File("data.txt")); */ 
		
//	System.out.println(l);
		
		//l.forEach(System.out::println);
		
		l.stream().filter(data -> {return data.length()>=3;}).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
