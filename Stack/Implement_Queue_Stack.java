package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Implement_Queue_Stack {
    public static Stack<Integer>s1=new Stack<>();
    public static Stack<Integer>s2=new Stack<>();
	static void push(int x)
	{
		s1.push(x);
	}
	static int pop()
	{
		if(s1.isEmpty() && s2.isEmpty())
		{
			return Integer.MIN_VALUE;
		}
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
			s2.push(s1.pop());}
		}
		
		int x=s2.pop();
		return x;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			String s=sc.next();
			
			switch(s)
			{
			case "Enqueue":
			{
				push(sc.nextInt());
				break;
			}	
			case "Dequeue":
			{
				int d=pop();
				if(d==Integer.MIN_VALUE)
				{
					System.out.println("Empty");
				}
				else
				{
				System.out.println(d);}
			}
		}

	}

}
}