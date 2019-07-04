package com_5_6_19_practicals;
import java.util.LinkedList;
import java.util.List;

public class Prac147 {
	public static void main(String args[]) {
	   List l=new LinkedList();
	   l.add(10);
	   l.add(29);
	   l.add(80);
	   l.add(39);
	 // Object[] s1=l.toArray(new Object[0]); //using metod
	  Object[] a=new Object[l.size()];
	   for(int i=0;i<l.size();i++)
	   {
		   a[i]=l.get(i);
	   }
	    for(Object n:a) {
	    	 System.out.println("Array: " + n); 
	    }
	    }
	  
}
