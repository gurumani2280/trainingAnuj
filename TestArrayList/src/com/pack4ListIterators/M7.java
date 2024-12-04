package com.pack4ListIterators;

import java.util.ArrayList;
import java.util.Iterator;

public class M7 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list);
		Iterator<Integer> it = list.iterator();
		Integer obj;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.print(obj + ", ");
			if(obj.equals(190))
			{
				it.remove();
			}
		}
		System.out.println();
		System.out.println(list);

	}
}
