package Stack;

import java.util.Scanner;
import java.util.Stack;

public class reverse_word {
    static String reverse(String s)
    {
    	Stack<Character> a=new Stack<>();
    	String ans="";
    	for(int i=0;i<s.length();i++)
    	{	
    		a.push(s.charAt(i));
    	}
    	StringBuilder sb=new StringBuilder();
    	while(!a.isEmpty())
    	{
    		sb.append(a.pop());//=a.pop();
    	}
    	
    	return sb.toString();
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(reverse(s));
				
	}

}
