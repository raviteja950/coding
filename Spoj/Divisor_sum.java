package Spoj;

import java.util.Scanner;

public class Divisor_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t-->0)
		{
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					sum+=i;
				}
			}
			System.out.println(sum);
		}

	}

}
