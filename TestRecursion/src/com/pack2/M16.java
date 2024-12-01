package com.pack2;

public class M16
{
	public static void main(String[] args) 
	{
		String s1 = "helloToJava";
		print(s1, s1.length() - 1);	//print all s1 char from last index	to index 0 (reverse order	
	}
	static void print(String s1, int index)
	{
		System.out.println(s1.charAt(index --));
		if(index == -1)
		{
			return;
		}
		print(s1, index);
	}
}
