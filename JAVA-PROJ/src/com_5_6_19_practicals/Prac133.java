package com_5_6_19_practicals;

import java.util.LinkedList;

public class Prac133 {
	public static void main(String[] args)
	{
		LinkedList s=new LinkedList();
		s.add(1);
		s.add(2);
		s.add(56);
		s.add(0, 89);
		s.addLast(67);
		System.out.println(s.getFirst());
		System.out.println(s.getLast());
}
}