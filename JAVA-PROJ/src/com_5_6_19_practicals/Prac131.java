package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac131 {

	public static void main(String[] args) {
		System.out.println("enter n number");
		Scanner s = new Scanner(System.in);
		int ans = 0, n = s.nextInt();
		for (int i = 0; i <= n; i++) {
			ans = ans + i;
		}

		System.out.println("summation is" + ans);
	}

}
