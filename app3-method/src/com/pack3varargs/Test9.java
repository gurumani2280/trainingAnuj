package com.pack3varargs;

public class Test9 {

	public static void main(String[] args) {
		int i = 10;
		test(i);

	}

//	static void test(int i) {
//		System.out.println("int");
//	}

//	static void test(double obj) {
//		System.out.println("double");
//	}

//	static void test(Integer obj) {
//		System.out.println("Integer");
//	}

//	static void test(Number obj) {
//		System.out.println("Number");
//	}

//	static void test(Object obj) {
//		System.out.println("Object");
//	}

	static void test(int... i)// int primitive var arg
	{
		System.out.println("var arg");
	}

}

/*
 Output is int. if corresponding method commented then Output will be
 double.now comment 2nd method Output will be Integer Now comment sucessive
 methods to get different output. 
 
 Note:First preference goes to widening then boxing and last preference goes to var arg. 
 1. widening 2. boxing 4.boxing&upcasting 3.var arg
 */
