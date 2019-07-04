package com_5_6_19_practicals;

public class Prac75 {
	void fib(int n) {
		int n3, a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < n; i++) {
			n3 = a + b;
			System.out.println(n3);

			a = b;
			b = n3;

		}

	}

	public static void main(String args[]) {

		Prac75 ob = new Prac75();
		ob.fib(10);
	}
}
