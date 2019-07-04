package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac109 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double d;
		String c = "";
		double d2 = 0;
		while (true) {
			System.out.println("enter input:");
			d = s.nextDouble();
			if (d == 0) {
				// break;
			}
			System.out.println("enter input:");
			c = s.next();
			System.out.println("enter input:");
			d2 = s.nextDouble();

			switch (c) {
			case "+":
				System.out.println(d + d2);
				break;
			case "*":
				System.out.println(d * d2);
				break;
			case "-":
				System.out.println(d - d2);
				break;
			case "/":
				System.out.println(d / d2);
				break;
			default:
				System.out.println("enter valid input:");
				break;
			}
		}
	}
}
