package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Median_of_two_sorted_Arrays {
static void mergeTwoArray(int a[],int b[],int n,int m)
{
	int temp[]=new int[n+m];
	int p1=0;
	int p2=0;
	int k=0;
	while(p1<n && p2<m)
	{
		if(a[p1]<b[p2])
		{
			temp[k++]=a[p1++];
		}
		else
		{
			temp[k++]=b[p2++];
		}
	}
		while(p1<n)
		{
			temp[k++]=a[p1++];
		}
		while(p2<m)
		{
			temp[k++]=b[p2++];
		}
		
		if((n+m)/2!=0)
		{
			System.out.println(temp[n+m/2]);
		}
		else
		{
			int x=n+m/2;
			int p=temp[x];
			int q=temp[x-1];
			System.out.print((double)(p+q)/2);
		}
		
//	for(int i=0;i<n+m;i++)
//	{
//		System.out.print(temp[i]+" ");
//	}
			
			
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int j=0;j<m;j++)
		{
			b[j]=sc.nextInt();
		}
       mergeTwoArray(a,b,n,m);
	}

}
