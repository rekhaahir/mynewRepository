package com_5_6_19_practicals;

interface Test {
	void show();

	default void print()// in java8
	{
		System.out.println("this is interface msg");
	}
}

public class Prac66 implements Test {
	public void show() {

		System.out.println("this is class msg");
	}

	public static void main(String[] args) {
		Prac66 ob = new Prac66();
		ob.show();

	}

}
