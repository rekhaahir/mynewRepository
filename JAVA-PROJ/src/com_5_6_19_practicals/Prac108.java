package com_5_6_19_practicals;

public class Prac108 {
	 public static void main(String[] args) {
		   
	       int N;           
	       int maxD;  
	       int numWithMax;   
	       
	       maxD = 1;  
	       numWithMax = 1;
	       for ( N = 5;  N <= 100;  N++ ) {
	       
	           int D; 
	           int divisorCount; 
	           
	           divisorCount = 0;
	           
	           for ( D = 1;  D <= N;  D++ )
	           { 
	              if ( N % D == 0 )
	                 divisorCount++;
	           }
	           
	           if (divisorCount > maxD) 
	           {
	              maxD = divisorCount;
	              numWithMax = N;
	           }
	       
	       }
	       
	        System.out.println("The maximum number of divisors is " + maxD);
	       System.out.println("A number with " + maxD+ " divisors is " + numWithMax);
	   
	   } 
}
