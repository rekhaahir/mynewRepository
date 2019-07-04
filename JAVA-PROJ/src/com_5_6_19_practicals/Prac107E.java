package com_5_6_19_practicals;

public class Prac107E {
	public static void main(String[] args) {

		int die1, die2;

		int countRolls;

		countRolls = 0;

		do {
			die1 = (int) (Math.random() * 6) + 1; 
			die2 = (int) (Math.random() * 6) + 1;
			countRolls++; // and count this roll
		} while (die1 != 1 || die2 != 1);

		System.out.println("It took " + countRolls + " rolls to get snake eyes.");

	}
}
