package Practice;

import java.util.Scanner;

public class SubArray {
	static void printArray(int a[],int s,int e)
	{
	for(int i=s;i<=e;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	}
    static void printSubArray(int a[])
    {
    	for(int s=0;s<a.length;s++)
    	{
    		for(int e=s;e<a.length;e++)
    		{
    			printArray(a,s,e);
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			
      printSubArray(a);
	}

}
