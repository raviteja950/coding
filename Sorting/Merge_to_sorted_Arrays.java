package Sorting;

import java.util.Scanner;

public class Merge_to_sorted_Arrays {
    static void print(int n,int m,int a[],int b[])
    {
    	int p1=0,p2=0;
    	while(p1<n && p2<m)
    	{
    		if(a[p1]<b[p2])
    		{
    			System.out.print(a[p1++]+" ");
    		}
    		else
    		{
    			System.out.print(b[p2++]+" ");
    		}
    	}
    	while(p1<n)
    	{
    		System.out.print(a[p1++]+" ");
    	}
    	while(p2<m)
    	{
    		System.out.print(b[p2++]+" ");
    	}
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size of a1");
		int n=sc.nextInt();
		//System.out.println("enter element");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//System.out.println("enter the size of a2");
		int n2=sc.nextInt();
		//System.out.println("enter element");
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		 print(n,n2,a,b);		

	}

}
