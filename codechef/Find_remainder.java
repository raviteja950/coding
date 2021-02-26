package codechef;

import java.util.Scanner;

public class Find_remainder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int sum;
			int a=sc.nextInt();
			int b=sc.nextInt();
			sum=a%b;
			System.out.println(sum);
		}
	}

}
