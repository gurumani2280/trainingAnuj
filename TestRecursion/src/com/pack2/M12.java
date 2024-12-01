package com.pack2;

public class M12
{
	static int sum;// using global static variable to store sum

	static void findSum(int num) // return type void
	{
		sum += num;
		if(num == 20)
		{
			return;
		}
		num ++;
		findSum(num);
	}

	public static void main(String[] args) 
	{
		findSum(11);// sum of number from 11 to 20
		System.out.println(sum);
	}
}
