package com_5_6_19_practicals;

import java.util.Collections;
import java.util.Vector;

public class Prac139 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(0, 10);
		v.add(1, 30);

		Collections.swap(v, 0, 1);
		System.out.println(v);
	}

}
