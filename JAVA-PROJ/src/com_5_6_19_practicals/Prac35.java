package com_5_6_19_practicals;

public class Prac35 {
	public static void main(String[] arg) {
		int[] a = { 3, 4, 5, 6 };
		int[] b = { 2, 4, 53, 4 };
		int[] c = new int[a.length + b.length];
		int i;
		for (i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int j = 0; j < a.length; j++) {
			c[i++] = b[j];
		}
		for (i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}
}
