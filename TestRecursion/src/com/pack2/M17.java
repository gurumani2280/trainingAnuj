package com.pack2;
import java.util.Arrays;

public class M17 
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60};
		//                0    1   2   3   4   5
		System.out.println("Initial:" + Arrays.toString(elements));
		reverse(elements, 0);// reversing array content in place
		System.out.println("final:" + Arrays.toString(elements));
	}
	static void reverse(int[] elements, int index)
	{
		if(index == elements.length / 2)
		{
			return;
		}
		// swaping array elements
		int temp = elements[index];
		elements[index] = elements[elements.length - 1 - index];
		elements[elements.length - 1 - index] = temp;
		index ++;
		reverse(elements, index);
	}
}
