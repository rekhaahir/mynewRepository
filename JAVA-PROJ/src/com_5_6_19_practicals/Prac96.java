package com_5_6_19_practicals;

import java.util.EmptyStackException;
import java.util.Stack;

public class Prac96 {
	public static void main(String[] args) {
		try {
			Stack<Integer> s = new Stack<Integer>();
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			while (s.isEmpty() == false) 
			{
				System.out.println(s.pop());
				if (s.isEmpty()) {
					throw new EmptyStackException();
				}
			}
		}
		catch (EmptyStackException e) {
			System.out.println(e);
		}

	}
}
