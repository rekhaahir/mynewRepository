package com_5_6_19_practicals;

public class Prac102 {
  public static void main(String[] args) {  
          
          try{    
               int c=40/0;  
               
               System.out.println(c);  
              }    
              catch(ArithmeticException e)  
                 {  
                  System.out.println("Arithmetic Exception occurs divide by 0");  
                 }    
              catch(ArrayIndexOutOfBoundsException e)  
                 {  
                  System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                 }    
              catch(Exception e)  
                 {  
                  System.out.println("Parent Exception occurs");  
                 }             

}
}
