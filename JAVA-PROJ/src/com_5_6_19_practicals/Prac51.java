package com_5_6_19_practicals;

public class Prac51 {
	public static void main(String[] args) {
		int number = 7874;
		int rem, real, rev = 0;
		real = number;

		while (number != 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number /= 10;

		}
		if (real == rev) {
			System.out.println("pelindrome");

		} else {
			System.out.println("number is not pelindrome");

		}
	}
}
