package com.pack3BasicArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class M24 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
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
		Collections.sort(list1);
		System.out.println(list1);
	}
}






