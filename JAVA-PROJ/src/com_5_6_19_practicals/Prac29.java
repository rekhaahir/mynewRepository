package com_5_6_19_practicals;

import java.util.*;

public class Prac29 {
	public static void main(String[] args) {

		int a[] = { 20, 3, 5, 3, 4 };
		boolean flag = false;
		System.out.println("enter element you want to find");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < (a.length - 1); j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int j = 0; j < a.length; j++) {

			System.out.println(a[j]);
			if (a[j] == x) {
				flag = true;

			}
		}

		if (flag) {
			System.out.println("element is founded");
		}
	}
}
