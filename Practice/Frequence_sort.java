package Practice;

import java.util.Scanner;

public class Frequence_sort {
   static void frequence(int a[],int n)
   {
	   int f[]=new int[2001];
	   for(int i=0;i<n;i++)
	   {
		   f[a[i]+1000]++;
	   }
	int min=1;
	int max=0;
	for(int i=0;i<=2000;i++)
	{
		if(f[i]!=0)
		{
			if(min>f[i])
			{
				min=f[i];
			}
			if(max<f[i])
			{
				max=f[i];
			}
		}
	}
	for(int i=min;i<=max;i++)
	{
		for(int j=0;j<=2000;j++)
		{
			if(f[j]==i)
			{
				while(f[j]--!=0)
				{
					System.out.print(j-1000+" ");
				}
			}
		}
	}
	System.out.println();
	  
   }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		frequence(a,n);
				

	}

}
