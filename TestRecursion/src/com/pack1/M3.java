package com.pack1;

public class M3 {

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		printnumbers(10);
		System.out.println("Main End");
	}
	public static void printnumbers(int num)
	{
		System.out.println(num);
		if(num > 0)
		{
			printnumbers(num-1);
		}
		
	}

}
