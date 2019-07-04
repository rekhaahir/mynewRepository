package com_5_6_19_practicals;

import java.io.File;

public class Prac117 {
	public static void main(String[] args) {
		String directories = "/home/rekhaahir/a/b";
		File file = new File(directories);
		boolean result = file.mkdirs();
		System.out.println("Status = " + result);
		file.delete();

	}
}
