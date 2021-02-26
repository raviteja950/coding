package Strings;
import java.util.*;
public class MIN_MAX_ELEMENT_USING_STACK
{
			public static Stack<Integer> s1=new Stack<>();
			public static Stack<Integer> s2=new Stack<>();
	public void push(int x)
	{
		  s1.push(x);
		if(s2.isEmpty() || s1.peek()>=s2.peek())
		{
			s2.push(x);
		}
	}
	
	public void pop()
	{   
		 s1.pop();
		 s2.pop();
	}
	public void max()
	{
		
		if(s1.empty())
		{
			System.out.println("Empty");
		
			
		}
		
		System.out.println(s2.peek());
		
	}
	
	

	public static void main(String[] args) 
	{
		MIN_MAX_ELEMENT_USING_STACK a=new MIN_MAX_ELEMENT_USING_STACK();
		a.push(5);
		a.max();
		a.pop();
		a.max();
		a.pop();
		a.pop();
	}

}
