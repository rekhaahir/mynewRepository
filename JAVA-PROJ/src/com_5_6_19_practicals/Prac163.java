package com_5_6_19_practicals;

class Democ implements Runnable {
	public void run() {
		System.out.println("running:");

	}

}

public class Prac163 {

	public static void main(String args[]) {
		Democ d = new Democ();
		Thread t = new Thread(d);
		t.start();
	}

}
