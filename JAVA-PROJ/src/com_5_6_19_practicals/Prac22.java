package com_5_6_19_practicals;

public class Prac22 {
	public static void main(String[] args) {
		String str = "India is my country";
		char[] s2 = str.toCharArray();
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += s2[i];
		}

		System.out.println(s);
	}
}
