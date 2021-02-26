package codechef;

import java.util.Scanner;

public class Squart_of_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			System.out.println((int)Math.sqrt(n));
		}

	}

}
