package Practice;

import java.util.Scanner;

public class Merger_sort_Two_pointer {
    static void merge(int a[],int n,int l,int h)
    {
    	int temp[]=new int[h-l+1];
    	int m=(l+h)/2;
    	int p1=l;
    	int p2=m+1;
    	int k=0;
    	while(p1<=m && p2<=h)
    	{
    		if(a[p1]>a[p2])         //for small to big
    		{                       // for big to small just change to > to < 
    			temp[k++]=a[p2++];
    		}
    		else
    		{
    			temp[k++]=a[p1++];
    		}
    	}
    	while(p1<=m)
    	{
    		temp[k++]=a[p1++];
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
	
	
	static void ms(int a[],int n,int l,int h)
	{
		if(l==h)
		{
			return;
		}
		int m=(l+h)/2;
		ms(a,n,l,m);
		ms(a,n,m+1,h);
		merge(a,n,l,h);
	}
	static boolean twopointer(int a[],int n,int k)
	{
		int s=0;
		int e=n-1;
		while(s<e)
		{
			int sum=a[s]+a[e];
			if(sum==k)
			{
				return true;
		
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
		return false;
		
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
		int k=sc.nextInt();
		int l=0;
		int h=n-1;
		ms(a,n,l,h);
		boolean two=twopointer(a,n,k);
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		if(two==true)
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
	}

}
