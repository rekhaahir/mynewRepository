package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac107 {
	static void show(int a) {
		while (a > 10) {
			System.out.println(a);
			a--;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("enter  elements");

		a = s.nextInt();
		Prac107.show(a);
	}
}
