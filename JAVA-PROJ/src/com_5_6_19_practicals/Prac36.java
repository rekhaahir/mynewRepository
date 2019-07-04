package com_5_6_19_practicals;

import java.util.*;

public class Prac36 {
	public static void main(String args[]) {
		int array[] = new int[3];
		Arrays.fill(array, 100);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		Arrays.fill(array, 1, 3, 90);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
