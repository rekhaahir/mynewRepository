package com_5_6_19_practicals;

public class Prac103 {
	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			System.out.println(a[10]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}

	}
}
