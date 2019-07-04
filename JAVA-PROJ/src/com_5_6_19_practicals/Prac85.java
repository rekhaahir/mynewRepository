package com_5_6_19_practicals;

class LengthMatchException extends Exception {
	public LengthMatchException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

public class Prac85 {
	public void calc(String s, int len) throws LengthMatchException {
		if (len != s.length()) {
			throw new LengthMatchException("length is not match");
		}
	}

	public static void main(String[] args) {
		Prac85 ob = new Prac85();
		try {
			ob.calc("neha", 9);
		} catch (LengthMatchException e) {
			System.out.print(e);
		}

	}

}
