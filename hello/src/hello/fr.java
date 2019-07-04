package hello;

public class fr{
 
    private static fr myObj;
   private int  ab;
     
    static{
        myObj = new fr();
    }
     
    private fr(){
     
    }
     
    public static fr getInstance(){
        return myObj;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!"+ab);
    }
     
    public static void main(String a[]){
        fr ms = getInstance();
        fr  ob=new fr();
        ms.ab=4;
       
        	ob.ab=5;	
        ms.testMe();
        ob.testMe();
    }
}