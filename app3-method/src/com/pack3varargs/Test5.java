package com.pack3varargs;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		
		display(9);
		display(10, 1);
		display(11, 1, 2);
		display(12, 1, 2, 3);
		display(13, 1, 2, 3, 4);

	}
	
	public static void display(int a, int... values) {
		System.out.println("a ="+ a);
		System.out.println("number of variable args :- "+ values.length);
		System.out.println(Arrays.toString(values));
		
	}

}
