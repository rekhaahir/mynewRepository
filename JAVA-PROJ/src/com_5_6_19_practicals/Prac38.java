package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac38 {
	public static void main(String[] args) {

		int a[] = { 20, 3, 5, 3, 4 };
		boolean flag = false;
		int loc = 0;
		System.out.println("enter element you want to remove");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				flag = true;
				loc = i;
			}

		}
		if (flag) {
			for (int j = loc + 1; j < a.length; j++) {
				a[j - 1] = a[j];
			}

		}
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
		}

	}
}