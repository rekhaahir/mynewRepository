package com_5_6_19_practicals;

public class Prac98 {
	void a() {
		int data = 50 / 0;
	}

	void b() {
		a();
	}

	void c() {
		try {
			b();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Prac98 obj = new Prac98();
		obj.c();
		System.out.println("normal flow...");
	}
}
