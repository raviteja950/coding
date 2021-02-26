package codechef;

import java.util.Scanner;

public class Rever_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			long rever=0;
			while(n!=0)
			{
				int rem=n % 10;
				rever*=10+rem;
				n=n/10;
				System.out.print(rem);
			}
			
		}
	}

}
