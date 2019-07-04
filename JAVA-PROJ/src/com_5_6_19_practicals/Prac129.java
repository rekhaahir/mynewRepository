package com_5_6_19_practicals;

import java.io.File;

public class Prac129 {
	public static void main(String[] args) {
		File dir = new File("/home/rekhaahir/a/");
		String[] children = dir.list();

		if (children == null) {
			System.out.println("Either dir does not exist or is not a directory");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
