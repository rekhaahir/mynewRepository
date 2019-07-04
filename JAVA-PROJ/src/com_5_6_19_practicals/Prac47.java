package com_5_6_19_practicals;

public class Prac47 {
	public static void main(String[] args) {

		int eg;
		int dz;
		int abgross;
		int gross;
		int ex;
		eg = 1342;

		gross = eg / 144;
		abgross = eg % 144;

		dz = abgross / 12;
		ex = abgross % 12;

		System.out.print("Your number of eggs is ");
		System.out.print(gross);
		System.out.print("gross");
		System.out.print(dz);
		System.out.print("dozen, and ");
		System.out.print(ex);
		System.out.println();

	}
}
