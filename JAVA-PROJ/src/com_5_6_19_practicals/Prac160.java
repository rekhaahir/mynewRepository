package com_5_6_19_practicals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Prac160 {

	public static void main(String args[]) {
		List l = new LinkedList();
		l.add(10);
		l.add(60);
		l.add(30);

		Collections.replaceAll(l, 10, 90);
		System.out.println(l);

	}
}