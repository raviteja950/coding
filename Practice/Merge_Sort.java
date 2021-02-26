package Practice;

import java.util.Scanner;

public class Merge_Sort {
	public static void merge(int a[],int n,int l,int h)
	{
		int m=(l+h)/2;
		int temp[]=new int[h-l+1];
		int p1=l;
		int p2=m+1;
		int k=0;
		while(p1<=m && p2<=h)
		{
			if(a[p1]<=a[p2])
			{
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
		
		
		for(int i=0;i<k;i++)
		{
			a[l+i]=temp[i];
		}
		
	}
    public static void ms(int a[],int n,int l,int h)
    {
    	if(l==h)
    	{
    		return ;
    	}
    	int m=(l+h)/2;
    	ms(a,n,l,m);
    	ms(a,n,m+1,h);
    	merge(a,n,l,h);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int l=0;
		int h=n-1;
		ms(a,n,l,h);
		for(int i=0;i<n;i++)
{
			System.out.print(a[i]+" ");
		}

	}

}
