package collections;
import java.util.*;
public class stack {

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<>();
		stack.push("Roshan");
		stack.push("Mathi");
		stack.push("Madhu");
		stack.push("Venmathi");
		
		for(int i=0;i<stack.size();i++)
		{
			System.out.print(stack.get(i) + " ");
		}
		System.out.println();
		System.out.println("The element to be popped from the stack: "+stack.pop());
		System.out.println("The first element that is present in a stack: "+ stack.peek());
		System.out.println();
		System.out.print("[");
		for(int i=0;i<stack.size();i++)
		{
			System.out.print(stack.get(i) + ", ");
		}
		System.out.print("]");
	}

}
