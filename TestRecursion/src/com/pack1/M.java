package com.pack1;

public class M {

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		printnumbers(10);
		System.out.println("Main End");
	}
	public static void printnumbers(int num)
	{
		if(num > 0)
		{
			printnumbers(num-1);
		}
		System.out.println(num);
	}

}
