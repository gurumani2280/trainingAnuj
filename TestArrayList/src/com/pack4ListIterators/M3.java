package com.pack4ListIterators;

import java.util.ArrayList;

public class M3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		for(Integer element : list)
		{
			System.out.print(element + ", ");
		}
	}
}
