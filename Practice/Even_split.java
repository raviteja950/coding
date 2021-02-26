package Practice;

import java.util.Scanner;

public class Even_split {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			if(n==2 || n==0)
			{
				System.out.println("No");
			}
			else if(n % 2 !=0)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
		}

	}

}
