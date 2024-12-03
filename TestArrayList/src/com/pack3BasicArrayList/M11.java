package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M11 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		//Object obj = list1.get(30); now element is stored as <Integer>
		Integer obj = list1.get(30); // index 3 not available so IndexOutOfBoundException
		System.out.println(obj);
	}
}
