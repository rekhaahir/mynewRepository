package com_5_6_19_practicals;

abstract class Demo // make class abstract
{
	int a;

	abstract void get();

	void print() {
		System.err.println(a);
	}
}

public class Prac65 extends Demo {
	void get() {
		a = 89;
		super.print();
	}

	public static void main(String[] args) {
		Demo ob = new Prac65();
		ob.get();
	}
}
