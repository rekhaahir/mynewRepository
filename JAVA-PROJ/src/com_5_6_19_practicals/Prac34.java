package com_5_6_19_practicals;

public class Prac34 {

	void min(int a[]) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
				// max=a[j];
			}

		}
		System.out.println(min);

	}

	void max(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println(max);
	}

	public static void main(String[] arg) {

		int[] a = { 10, 2, 0, 55 };
		Prac34 ob = new Prac34();
		ob.min(a);
		ob.max(a);
	}

}
