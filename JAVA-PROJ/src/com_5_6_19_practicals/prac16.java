package com_5_6_19_practicals;

class prac {
	static int i = 90;
}

class prac16 {
	public static void main(String[] args) {
		prac.i = 80;
		System.out.println("value is" + prac.i);
	}
}
