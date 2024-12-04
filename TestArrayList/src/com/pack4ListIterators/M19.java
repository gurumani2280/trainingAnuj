package com.pack4ListIterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class M19 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list);
		ListIterator<Integer> it = list.listIterator();	
		Object obj;
		while(it.hasNext())
		{
			obj = it.next();
			if(obj.equals(910))
			{
				it.set(300);
			}
			System.out.print(obj + ", ");
		}
		System.out.println();
		System.out.println(list);
	}
}
