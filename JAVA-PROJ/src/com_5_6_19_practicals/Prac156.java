package com_5_6_19_practicals;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Prac156 {
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();

		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		Set st = ht.entrySet();

		System.out.println("Set created from Hashtable Keys contains :");
		Iterator itr = st.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		Enumeration e = ht.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
