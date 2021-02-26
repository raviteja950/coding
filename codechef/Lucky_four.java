package codechef;

import java.util.Scanner;

public class Lucky_four {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int count=0;
		int n=sc.nextInt();
		while(n>0)
		{
			if(n%10==4)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
	}

}
