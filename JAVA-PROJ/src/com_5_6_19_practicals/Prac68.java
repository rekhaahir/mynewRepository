package com_5_6_19_practicals;

class Demo1 {
	void test() {
		System.out.println("parent class");
	}
}

public class Prac68 extends Demo1 {
	void test() {

		System.out.println("child class");
		super.test();
	}

	public static void main(String[] args) {
		Prac68 ob = new Prac68();
		ob.test();
	}

}
