package com_5_6_19_practicals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Prac158 {

	public static void main(String args[]) {
		List l = new LinkedList();
		l.add(10);
		l.add(60);
		l.add(30);

		System.out.println("max is:" + Collections.max(l));
		System.out.println("min is:" + Collections.min(l));

	}
}
