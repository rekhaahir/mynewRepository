package Practice;
public class Threading extends Thread{  
	 public void run(){  
	  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
	   System.out.println("daemon thread work");  
	  }  
	  else{  
	  System.out.println("user thread work");  
	 }  
	 }  
	 public static void main(String[] args){  
		 Threading  t1=new Threading ();//creating thread  
		 Threading  t2=new Threading ();  
		 Threading t3=new Threading ();  
	  
	 // t1.setDaemon(true);//now t1 is daemon thread  
	    
	  t1.start();//starting threads  
	  t2.start();  
	  t3.start();  
	 }  
	}  