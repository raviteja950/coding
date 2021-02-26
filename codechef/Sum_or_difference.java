package codechef;

import java.util.Scanner;

public class Sum_or_difference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n>m)
		{
			System.out.println(n-m);
		}
		else
		{
			System.out.println(n+m);
		}

	}

}
