package Hacker_Rank;

import java.util.Scanner;

public class Sparse_Arrays {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		int x=sc.nextInt();
		int c[]=new int[x];
		for(int i=0;i<x;i++)
		{
			int count=0;
			String f=sc.next();
			for(int k=0;k<a.length;k++)
			{
				if(a[k].equalsIgnoreCase(f))
				{
					count=count+1;
					c[i]=count;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
				
				

	}

}
