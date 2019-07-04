package com_5_6_19_practicals;

public class Prac24 {
	public static void main(String[] args) {
		String str = "India is my country";
		String[] s2 = str.split("\\s");
		for (String w : s2)
			System.out.println(w);
	}

}
