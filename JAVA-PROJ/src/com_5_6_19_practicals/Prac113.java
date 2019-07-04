package com_5_6_19_practicals;

public class Prac113 {
	  public static void main(String[] args) {
		  
	       boolean[] used;  // For recording the possible birthdays
	                        //   that have been seen so far.  A value
	                        //   of true in used[i] means that a person
	                        //   whose birthday is the i-th day of the
	                        //   year has been found.
	 
	       int count;       // The number of people who have been checked.
	       
	       int birthdaysFound;   // The number of different birthdays that
	                             // have been found.
	 
	       used = new boolean[365];  // Initially, all entries are false.
	       
	       count = 0;
	       
	       birthdaysFound = 0;
	 
	       while (birthdaysFound < 365) {
	              // Select a birthday at random, from 0 to 364.
	              // If the birthday has not already been used,
	              // add 1 to birthdaysFound.
	          int birthday;  // The selected birthday.
	          birthday = (int)(Math.random()*365);
	          count++;
	          if ( used[birthday] == false )
	             birthdaysFound++;
	          used[birthday] = true;
	       }
	 
	       System.out.println( count + " people were checked." );
	 
	    }
	  
	    
	
}
