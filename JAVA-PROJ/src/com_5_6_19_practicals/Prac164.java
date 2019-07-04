package com_5_6_19_practicals;

class Demo4 implements Runnable {
	public void run() {
		System.out.println("running:" + Thread.currentThread().getName());
		System.out.println("running:" + Thread.currentThread().getPriority());

	}

}

public class Prac164 {
	
		public static void main(String args[])
		{
		Demo4 d=new Demo4();
		Demo4 d2=new Demo4();
		Thread t2=new Thread(d2);
		Thread t=new Thread(d);
		t.start();
		t2.start();
		t2.setPriority(10);
		t.setPriority(1);
		}
	
		
}
