package hello;

public class SingletonPatternDemo {
	public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
		 fr ms = fr.getInstance();
		 ms.testMe();
	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      SingleObject obje= SingleObject.getInstance();
	      //show the message
	      object.showMessage();
	      obje.showMessage();
	   }
}
