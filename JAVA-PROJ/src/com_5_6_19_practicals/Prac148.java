package com_5_6_19_practicals;

import java.util.LinkedList;
import java.util.List;

public class Prac148 {
	public static void main(String args[]) {
		List l = new LinkedList();
		l.add(10);
		l.add(29);
		l.add(80);
		l.add(39);

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

	}
}