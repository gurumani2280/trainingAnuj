package com.pack2;

public class M15
{
	public static void main(String[] args) 
	{
		String s1 = "helloToJava";
		print(s1, 0);	// print all s1 chars starting index 0	
	}
	static void print(String s1, int index)
	{
		System.out.println(s1.charAt(index ++));
		if(index == s1.length())
		{
			return;
		}
		print(s1, index);
	}
}
