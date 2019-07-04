import java.util.EmptyStackException;
import java.util.Stack;

public class Prac96 {
	public static void main(String args[]){  
		Stack s=new Stack();
		try
		{s.push("1");
		s.pop();
			throw new EmptyStackException();
		}
		catch(EmptyStackException e)
		{
			System.out.print(s.empty());
			System.out.print(e);
		}
		
	}

}
