package com_5_6_19_practicals;

import java.util.LinkedList;

public class Prac137 {

	
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add(10);
		ls.add(20);
		if (ls.contains(10)) {
			System.out.println(ls.indexOf(20));
		}
	}

}
