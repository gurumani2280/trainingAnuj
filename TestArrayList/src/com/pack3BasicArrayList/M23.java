package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M23 extends ArrayList<Integer>{
	
	public static void main(String[] args) {
		M23 list1 = new M23();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		list1.add(230);
		list1.add(230);
		list1.add(293);
		list1.add(295);
		System.out.println(list1);
		list1.removeRange(2, 7);
		System.out.println(list1);
	}
}
