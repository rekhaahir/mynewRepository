package com_5_6_19_practicals;

import java.util.Vector;

public class Prac155 {

	public static void main(String args[]) {
		Vector v = new Vector();
		v.add("a");
		v.add("b");
		v.add("c");
		Object ob = v.clone();
		System.out.println(ob);
	}
}
