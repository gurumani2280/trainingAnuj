package com.pack2;

public class M11
{
	static int sum; 

	static void findSum(int num)
	{
		sum += num;
		if(num == 5)
		{
			return;
		}
		num ++;
		findSum(num);
	}

	public static void main(String[] args) 
	{
		findSum(1);// sum of number from 1 to 5 
		System.out.println(sum);
	}
}
