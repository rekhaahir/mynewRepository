package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac46 {
	public static void main(String[] args) {
		int qt = 0;
		int dm = 0;
		int nk = 0;
		int pn = 0;
		double dollar = 0.0;

		Scanner s = new Scanner(System.in);
		System.out.println("enter quarters");
		qt = s.nextInt();
		System.out.println("enter dimes");
		dm = s.nextInt();
		System.out.println("enter nickels ");
		nk = s.nextInt();
		System.out.println("enter pennies");
		pn = s.nextInt();
		dollar = (0.25 * qt) + (0.10 * dm) + (0.05 * nk) + (0.01 * pn);
		System.out.println(dollar);
	}
}