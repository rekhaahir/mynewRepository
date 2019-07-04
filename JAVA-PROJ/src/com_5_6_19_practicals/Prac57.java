package com_5_6_19_practicals;

public class Prac57 {
	static boolean isPerfectSquare(double x) {

		// Find floating point value of
		// square root of x.
		double sr = Math.sqrt(x);

		// If square root is an integer
		return ((sr - Math.floor(sr)) == 0);
	}

	// Driver code
	public static void main(String[] args) {
		double x = 64;

		if (isPerfectSquare(x))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
