package com_5_6_19_practicals;

public class Prac18 {

	public static void main(String[] args) {
		String a = "yes";
		String b = "YES";
		String c = new String("yes");
		if (a.equals(c)) {
			System.out.println("equal");

		}
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.compareTo(b));// positive value
	}

}
