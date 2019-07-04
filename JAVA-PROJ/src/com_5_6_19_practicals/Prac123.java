package com_5_6_19_practicals;

import java.io.File;

public class Prac123 {
	public static void main(String[] argv) throws Exception {
		File dir = new File("home");
		String[] children = dir.list();

		if (children == null) {
			System.out.println("does not exist or" + "is not a directory");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
