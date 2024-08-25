package com.pack3varargs;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		
		System.out.println("addition : " + add(9, new int[]{}));
		System.out.println("addition : " + add(10, new int[]{1}));
		System.out.println("addition : " + add(11, new int[]{1, 2}));
		System.out.println("addition : " + add(12, new int[]{1, 2, 3}));
		System.out.println("addition : " + add(13, new int[]{1, 2, 3, 4}));

	}
	
	public static int add(int a, int[] values) {
		System.out.println("a ="+ a);
		System.out.println("number of array args :- "+ values.length);
		System.out.println(Arrays.toString(values));
		int sum = a;
		for(int i: values) {
			sum += i;
		}
		return sum;
		
	}

}
