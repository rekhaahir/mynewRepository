package com_5_6_19_practicals;

public class Prac52 {
	static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return (n * fact(n - 1));
	}

	public static void main(String[] args) {

		int no = 5;
		int rslt = Prac52.fact(no);
		System.out.println(rslt);
	}
}
