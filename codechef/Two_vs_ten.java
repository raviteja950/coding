package codechef;

import java.util.Scanner;

public class Two_vs_ten {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int f=n%10;
			if(f==5)
			{
				System.out.println(1);
			}
			else if(f==0)
				{
					System.out.println(0);
				}
			else
			{
				System.out.println(-1);
			}
		}

	}

}
