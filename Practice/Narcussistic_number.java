package Practice;

import java.util.Scanner;

public class Narcussistic_number {
    static int countD(int n)
    {
    	if(n==0)
    		return 0;
    	return 1+countD(n/10);
    				
    }
	static int nar(int n)
	{
		int l=countD(n);
		int sum=0;
		while(n>0)
		{
			sum+=Math.pow(n%10, l);
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(nar(n)==n)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
