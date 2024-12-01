package com.pack2;

public class M22
{
	public static void main(String[] args) 
	{
		int i = 47245;
		int sum = digitsSum(i);// sum of digit	
		System.out.println(sum);
	}
	static int digitsSum(int i)
	{
		if(i == 0)
		{
			return 0;
		}
		return i % 10 + digitsSum(i / 10);
	}
}
