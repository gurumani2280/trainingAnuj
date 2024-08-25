package com.pack3varargs;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		
		display(9);
		display(10, "myValue1");
		display(11, "myValue1", "myValue2");
		display(12, "myValue1", "myValue2", "myValue3");
		display(13, "myValue1", "myValue2", "myValue4", "myValue4");

	}
	
	public static void display(int a, String... values) {
		System.out.println("a ="+ a);
		System.out.println("number of variable args :- "+ values.length);
		System.out.println(Arrays.toString(values));
		
	}

}
