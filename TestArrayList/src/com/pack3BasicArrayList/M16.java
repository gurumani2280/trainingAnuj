package com.pack3BasicArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class M16 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);

		Iterator<Integer> it = list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}		
	}
}
