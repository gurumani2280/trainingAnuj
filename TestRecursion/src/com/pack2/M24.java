/*

111111
111111
111111
111111

*/
package com.pack2;

public class M24
{
	public static void main(String[] args) 
	{
		int rows = 4, cols = 6;
		printRows(rows, cols); // printing patterns
	}
	static void printRows(int rows, int cols)
	{
		if(rows == 0)
		{
			return;
		}
		printCols(cols);
		System.out.println();
		printRows(--rows, cols);
	}	
	static void printCols(int cols)
	{
		if(cols == 0)
		{
			return;
		}
		System.out.print(1);
		printCols(--cols);
	}
}
