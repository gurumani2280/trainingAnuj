package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M22 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(90);
		list2.add(190);
		System.out.println(list2);
		System.out.println("------------");
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		System.out.println(list2);	
	}
}
