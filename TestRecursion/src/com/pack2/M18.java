package com.pack2;

public class M18 
{
	public static void main(String[] args) 
	{
		int sum = sum(1);// sum of numbers from 1 to 5 - here not using static variable
		System.out.println(sum);
	}
	static int sum(int i) // return type int
	{
		if(i == 5)
		{
			return 5;
		}
		return i + sum(++i);
	}
}
