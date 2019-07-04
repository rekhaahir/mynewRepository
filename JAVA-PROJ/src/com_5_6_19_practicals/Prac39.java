package com_5_6_19_practicals;

public class Prac39 {
	public static void main(String[] args) {
		int i;
		int a[] = { 1, 2, 3, 5, 6 };
		int b[] = { 2, 3, 9, 8 };
		int c[] = new int[a.length + b.length];

		for (i = 0; i < a.length; i++) {

			c[i] = a[i];

		}
		for (int j = 0; j < b.length; j++) {
			c[i++] = b[j];
		}
		for (i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
