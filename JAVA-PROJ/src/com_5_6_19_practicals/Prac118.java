package com_5_6_19_practicals;

import java.io.File;

public class Prac118 {
	public static void main(String[] args) {
		String directories = "/home/rekhaahir/a/b/t.txt";
		File file = new File(directories);
		boolean result = file.mkdirs();
		System.out.println("Status = " + result);
		if (file.isDirectory()) {
			if (file.list().length > 0) {
				System.out.println("not empty");
			} else {
				System.out.println("empty");

			}
		}

	}

}
