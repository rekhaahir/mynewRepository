package com_5_6_19_practicals;

public class Prac80 {
	enum Day {
		SUNDAY, MONDAY, TUESDAY, wednesday, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String args[]) {
		Day day = Day.wednesday;

		switch (day) {
		case SUNDAY:
			System.out.println("sunday");
			break;
		case MONDAY:
			System.out.println("monday");
			break;
		default:
			System.out.println("other day");
		}
	}
}
