package com_5_6_19_practicals;

import java.io.File;

public class Prac127 {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		System.out.println("Root directories in your system are:");

		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i].toString());
		}
	}// it will give"/" only ,in unix
}
