package Sorting;

import java.util.Scanner;

public class Merge_sort {
     static void merge(int a[],int n ,int l,int h)
    {
    	if(l==h)
    	{
    		return;
    	}
    	int m=(l+h)/2;
    	merge(a,n,l,m);
    	merge(a,n,m+1,h);
    	ms(a,n,l,h);
    
    }
     static void ms(int a[],int n,int l,int h)
     {
    	 int m=(l+h)/2;
    	 int temp[]=new int[h-l+1];
    	 int p=l,p2=m+1,k=0;
    	 while(p<=m && p2<=h)
    	 {
    		 if(a[p]<=a[p2])
    		 {
    			 temp[k++]=a[p2++];
    		 }
    		 else
    		 {
    			 temp[k++]=a[p++];
    			 
    		 }
    	 }
    	 
    	 while(p<=m)
    	 {
    		 temp[k++]=a[p++];
    	 }
    	 while(p2<=h)
    	 {
    		 temp[k++]=a[p2++];
    	 }

    	 for(int i=l;i<=h;i++)
    	 {
    		 a[i]=temp[i-l];
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
		int low=0;
		int heigh=n-1;
	       merge(a,n,low,heigh);
//		for(int i=n-1;i>=0;i--)
//		{
//			System.out.print(a[i]+" ");
//		}
		int count;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
			  if(a[i]==a[j] && i!=j )
				{
					count++;
				}
			}
			  if(count==0)
			   {
				System.out.print(a[i]+" ");
				break;
			   }
		}

	}

}
