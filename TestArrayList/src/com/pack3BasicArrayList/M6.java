package com.pack3BasicArrayList;

import java.util.ArrayList;

public class M6 {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		for(String s1 : args)
		{
			if(!list1.contains(s1))
			{
				list1.add(s1);
			}
		}
		System.out.println(list1);
	}
}
