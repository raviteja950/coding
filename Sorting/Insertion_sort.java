package Sorting;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			int idx=a[i];
			int j=i-1;
			
				while (j >= 0 && a[j] > idx) 
				{
					
	                a[j + 1] = a[j]; 
	               
	                j = j - 1; 
	            } 
				
	            a[j + 1] = idx;
	            
	           
		}
			
	
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
