package com_5_6_19_practicals;

public class Prac84 {
	void varargs() {
		System.out.println("method");

	}

	void varargs(String... val) {
		System.out.println("method1");
		for (String s : val) {
			System.out.println(s);
		}
	}

	void varargs(int... val) {
		System.out.println("method2");
		for (int s : val) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Prac84 ob = new Prac84();
		ob.varargs();
		ob.varargs("hi");
		ob.varargs("one", "two", "three");
		ob.varargs(10, 11, 18);
	}
}
