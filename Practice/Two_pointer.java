package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Two_pointer {
	static void twopointer(int a[],int n,int k)
	{
		
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int s=0;
		int e=n-1;
		while(s<e)
		{
		    int sum=a[s]+a[e];
		 if(sum==k)
		 {
			System.out.println("true");
	     }
		 else if(sum<k)
		 {
			s++;
		 }
		 else
		 {
			e--;
		 }
		}
		System.out.println("false");
	}
	
	
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int k=sc.nextInt();
	 twopointer(a,n,k);
    }
}

