package Sorting;

import java.util.Scanner;

public class Repeated_number_In_an_array {
	public static int repeated(int a[],int n)
	{
		
		int idx=0;
		int count[]=new int[n];
		for(int i=0;i<n;i++)
		{
			count[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			count[a[i]]++;
			idx=0;
		}
		for(int i=0;i<n;i++)
		{
			if(count[i]>count[idx])
			{
				idx=i;
			}
		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(count[i]+" ");
//		}
//		System.out.println();
		return idx;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(repeated(a,n));

	}

}
