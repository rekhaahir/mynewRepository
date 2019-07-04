package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac90 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter a and b");
			int a = sc.nextInt();
			int b = sc.nextInt();

			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally for close scanner");
			sc.close();
		}
	}

}
