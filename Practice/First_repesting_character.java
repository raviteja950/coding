package Practice;

import java.util.Scanner;

public class First_repesting_character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		String s=sc.next();
		String s1=sc.next();
		int n=s.length();
		int n2=s1.length();
		if(n2==n)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		}
	}

  }

