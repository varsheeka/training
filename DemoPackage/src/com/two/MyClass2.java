package com.two;

import com.one.MyClass;

public class MyClass2 {
	public void data() {
		MyClass m = new MyClass();
		m.display();
	}
}
// private method can be used only in the class.. not outside it
// PRIVATE -> property of class
// DEFAULT property to package.. cannot access outside it even with import statement
// PROTECTED similar to default.. difference child class can access it even if is present in another package.
