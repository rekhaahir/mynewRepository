package com_5_6_19_practicals;

class Demo23 extends Thread {
	public void run() {
		System.out.println("running ok:");

	}

}

class Prac162 {
	public static void main(String args[]) {
		Demo23 d = new Demo23();
		d.start();
	}
}