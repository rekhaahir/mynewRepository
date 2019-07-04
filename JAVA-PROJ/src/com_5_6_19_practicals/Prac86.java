package com_5_6_19_practicals;

import java.util.Scanner;

public class Prac86 {
	public static void main(String[] args) {
		try {
			int n, temp;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter no ");
			n = s.nextInt();
			int a[] = new int[n];
			System.out.println("Enter  elements:");
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("Second Largest:" + a[n - 2]);
			System.out.println("Smallest:" + a[0]);
			System.out.println("Smallest:" + a[10]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}

	}

}
