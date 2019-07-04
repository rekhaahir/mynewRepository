package com_5_6_19_practicals;

public class Prac94 {
	/*
	 * static void demo(int age) { if(age<18) { throw new
	 * ArithmeticException("you are not authorized"); } else {
	 * System.out.println("welcome"); } }
	 */
	public static void main(String[] args) {
		/*
		 * Prac94 d=new Prac94(); d.demo(19);
		 */
		try {
			int c = 30 / 0;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
