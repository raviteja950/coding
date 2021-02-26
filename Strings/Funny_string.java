package Strings;

import java.util.Scanner;

public class Funny_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		String s=sc.next();
		String srev="";
		int n=s.length();
		for(int i=n-1;i>=0;i--)
		{
			srev=srev+s.charAt(i);
		}
		int i;
		for( i=0;i<n-1;i++)
		{
			if(Math.abs(s.charAt(i)-s.charAt(i+1))==Math.abs(srev.charAt(i)-srev.charAt(i+1)))
					{
				     continue;
					}
			
			break;
					
		}
		if(i==n-1)
		{
			System.out.println("Funny");
		}
		else {
			System.out.println("Not Funny");
		}

	}
	}
}
