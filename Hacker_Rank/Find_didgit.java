package Hacker_Rank;

import java.util.Scanner;

public class Find_didgit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=n;
		int count=0;
		while(r>0)
		{
			if( r%10!=0 && n % (r%10)==0)
			{
				count++;
			}
			r=r/10;
		}
		
		System.out.println(count);
   }
}

