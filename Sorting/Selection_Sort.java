package Sorting;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			int temp;
			int idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[idx])
				{
			
					idx=j;
				}
				
			}
			 temp=a[idx];
			a[idx]=a[i];
			a[i]=temp;
			
			
		}
		
		
		
		
		
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
