package com.pack2;

public class M21 
{
	public static void main(String[] args) 
	{
		int i = 47245;
		print(i);	// print number digit in reverse order	
	}
	static void print(int i)
	{
		if(i == 0)
		{
			return;
		}
		System.out.println(i % 10);// printing last digit of number
		print(i / 10); // i /10 => reducing number by removing last digit
	}
}
