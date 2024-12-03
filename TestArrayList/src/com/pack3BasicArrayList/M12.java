package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M12 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		int i = (Integer)list1.get(2);
		System.out.println(i);
	}
}
