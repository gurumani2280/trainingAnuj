package com.pack2;

public class M14
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 5, 15, 1, 40};
		print(elements, elements.length - 1); //print all array element from last index	to index 0 (reverse order)
	}
	static void print(int[] elements, int index)
	{
		System.out.println(elements[index --]);
		if(index == -1)
		{
			return;
		}
		print(elements, index);
	}
}
