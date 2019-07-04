package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac48 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("enter yor name with space");
		name = s.nextLine();
		int pos = name.indexOf(' ');
		String fn = name.substring(0, pos);
		String ln = name.substring(pos + 1);

		System.out.println("your first name is" + fn + " " + "char is" + " " + fn.length());
		System.out.println("your Last name is" + ln + " " + "char is" + " " + ln.length());

	}
}
