package com_5_6_19_practicals;

public class Prac4142 {

	public static void main(String[] arg) {
		int[] a = { 3, 4, 5, 6 };
		int[] b = { 3, 4, 53, 4 };
		boolean flag = true;
		if (a.length != b.length) {
			flag = false;
		}
		if (flag) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.print("both arrays are  equal");

		} else {
			System.out.print("both arrays are not equal");

		}
	}
}
