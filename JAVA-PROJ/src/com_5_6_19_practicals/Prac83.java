package com_5_6_19_practicals;

public class Prac83 {
	static void varargs(String... val)
	{System.out.println("method");
	for(String s:val)
	{
		System.out.println(s);
	}
	}
	public static void main(String[] args) {
		varargs();
		varargs("hi");
		varargs("one","two","three");
		
	}
}
