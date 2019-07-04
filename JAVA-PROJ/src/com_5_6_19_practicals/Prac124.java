package com_5_6_19_practicals;

import java.io.File;

class Prac124 {
	public static long folderSize(File directory) {
		long length = 0;
		for (File file : directory.listFiles()) {
			if (file.isFile())
				length += file.length();
			else
				length += folderSize(file);
		}
		return length;
	}

	public static void main(String[] args) {
		Prac124 ob = new Prac124();
		File file = new File("/home/rekhaahir/a/b");
		System.out.print(folderSize(file));

	}
}