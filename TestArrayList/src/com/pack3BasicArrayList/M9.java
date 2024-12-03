package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M9 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(200);
		list2.add(90000);
		list2.addAll(list1);
		System.out.println(list1);
		System.out.println(list2);		
	}
}
