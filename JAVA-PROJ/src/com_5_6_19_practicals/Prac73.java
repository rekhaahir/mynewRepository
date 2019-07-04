package com_5_6_19_practicals;

public class Prac73 {
	void showarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	void showarray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4 };
		int[][] b = { { 1, 2, 3 }, { 5 }, { 6, 7, 8, 9 } };
		Prac73 ob = new Prac73();
		ob.showarray(x);
		ob.showarray(b);

	}
}
