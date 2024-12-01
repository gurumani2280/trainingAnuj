package com.pack2;

public class M13 
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 5, 15, 1, 40};
		print(elements, 0);	//  print array element starting index 0	
	}
	static void print(int[] elements, int index)
	{
		System.out.println(elements[index ++]);
		if(elements.length == index)
		{
			return;
		}
		print(elements, index);
	}
}
