package com_5_6_19_practicals;

import java.io.File;

public class Prac116 {
	public static void main(String[] args) {
	      String directories = "/home/rekhaahir/a/b";
	      File file = new File(directories);
	      boolean result = file.mkdir();
	      System.out.println("Status = " + result);
	    
	   }
}
