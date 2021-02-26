package codechef;

import java.util.Scanner;

public class Greedy_puppy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int max=0;
			for(int i=2;i<=b;i++)
			{
				if(max<a%i)
				{
					max=a%i;
				}
			}
			System.out.println(max);
		}

	}

}
