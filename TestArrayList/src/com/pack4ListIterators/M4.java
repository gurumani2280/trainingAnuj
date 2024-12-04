package com.pack4ListIterators;

import java.util.ArrayList;
import java.util.Iterator;

public class M4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
	}
}
