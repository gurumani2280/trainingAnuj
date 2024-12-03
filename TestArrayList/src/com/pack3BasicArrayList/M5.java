package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M5 {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		for(String s1 : args)
		{
			list1.add(s1);
		}
		System.out.println(list1);
	}
}
