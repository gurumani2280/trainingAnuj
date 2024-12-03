package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M14 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		for(int i = 0; i < list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
	}
}
