package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M2 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//list.add(909);
		list.add("abc");
		//list.add(909);
		//list.add(true);
		//list.add(909);
		//list.add('a');	
		System.out.println(list);
		list.add(2, "vijay");
		System.out.println(list);
	}
}
