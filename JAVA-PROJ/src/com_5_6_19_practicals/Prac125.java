package com_5_6_19_practicals;

import java.io.File;

public class Prac125 {

	public static void displayIt(File node) {

		System.out.println(node.getAbsoluteFile());

		if (node.isDirectory()) {
			String[] subNote = node.list();
			for (String filename : subNote) {
				displayIt(new File(node, filename));
			}
		}
	}

	public static void main(String args[]) {

		displayIt(new File("/home/rekhaahir/a/b"));
	}
}
