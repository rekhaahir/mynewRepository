package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac55 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number to check whether prime or not");
		int a = s.nextInt();
		int flag = 0;
		if (a == 0 || a == 1) {
			System.out.println("not a prime number");

		} else {
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0) {
					flag = 1;
					System.out.println("not a prime number");
					break;
				}

			}
			if (flag == 0) {
				System.out.println(" number is prime");
			}
		}
	}

}
