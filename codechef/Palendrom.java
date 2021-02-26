package codechef;

import java.util.Scanner;

public class Palendrom {

	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
	    int N=sc.nextInt();
	    int temp=N;
		int rev=0;
		while(temp!=0)
		{
			int r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
		}
		if(rev==N)
		{
			System.out.println("wins");
		}
		else
		{
			System.out.println("loses");
		}
		}
	}

}
