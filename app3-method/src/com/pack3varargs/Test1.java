package com.pack3varargs;

public class Test1 {

	public static void main(String[] args) {
		
		display();
		System.out.println();
		display("myValue1");
		System.out.println();
		display("myValue1", "myValue2");
		System.out.println();
		display("myValue1", "myValue2", "myValue3");
		System.out.println();
		display("myValue1", "myValue2", "myValue4", "myValue4");

	}
	
	public static void display(String... values) {
		System.out.println(values.length);
		for(int i = 0; i < values.length; i++) {
			System.out.print(values[i]+ ", ");
		}
	}

}
