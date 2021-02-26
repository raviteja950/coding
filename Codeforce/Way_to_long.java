package Codeforce;

import java.util.Scanner;

public class Way_to_long {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		String s=sc.next();
		int l=s.length();
		if(l>10)
		{
			s=(s.charAt(0)+""+(s.length()-2)+s.charAt(l-1));
			System.out.println(s);
		}
		else
		{
			System.out.println(s);
		}

	    }
	}

}
