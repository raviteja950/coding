package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Balance_parenthsis {
	static void balance(String s)
	{
		Stack<Character> a=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(a.isEmpty()!=true && a.peek()=='(' &&  s.charAt(i)==')' )
			{
				a.pop();
			}
			else if(a.isEmpty()!=true&& a.peek()=='{' && s.charAt(i)=='}')
			{
				a.pop();
			}
			else if(a.isEmpty()!=true && a.peek()=='[' && s.charAt(i)==']')
					{
				a.pop();
					}
			else
			{
				a.push(s.charAt(i));
			}
		}
		if(a.size()==0)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("In-valid");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		balance(s);

	}

}
