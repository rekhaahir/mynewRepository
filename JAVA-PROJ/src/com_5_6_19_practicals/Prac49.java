package com_5_6_19_practicals;

import java.io.*;

public class Prac49 {
	public static void main(String[] args) throws IOException {
		double average;
		FileReader fr;
		int i;
		BufferedReader br = new BufferedReader(new FileReader("/Home/Music/test.txt"));
		String ln = br.readLine();
		System.out.println("name" + ln);
		int a = br.read();
		int b = br.read();
		int c = br.read();
		average = (a + b + c) / 3.0;

		System.out.printf("The average grade for %s was %1.1f", ln, average);
		System.out.println();

	}

}
