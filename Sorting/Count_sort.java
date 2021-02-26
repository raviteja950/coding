package Sorting;

import java.util.Scanner;

public class Count_sort {
    public static void countsort(int a[],int n,int a1,int b)
    {
    	int r=b-a1+1;
    	int count[]=new int[r];
    	for(int i=0;i<n;i++)
    	{
    		count[i]=0;
    	}
    	for(int i=0;i<n;i++)
    	{
    		count[a[i]-a1]++;
    	}
    	int idx=0;
    	for(int i=0;i<r;i++)
    	{
    		while(count[i]>0)
    		{
    			a[idx]=i+a1;
    			idx--;
    			count[i]--;
    		}
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(count[i]+" ");
    	}
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		countsort(a,n,1,1);

	}

}
