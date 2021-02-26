package codechef;

import java.util.Scanner;

public class First_and_last_digit {
    static long fs(long n)
    {
    	while(n>=10)
    	{
    		n=n/10;
    	}
    	return n;
    }
    static long ls(long n)
    {
    	return n%10;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		long n=sc.nextInt();
		System.out.println(fs(n)+ls(n));
		}
	}

}
