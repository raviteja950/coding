package Strings;

import java.util.Scanner;

public class Prefix_sum {
   static void prefix(int a[],int p1,int p2)
   {
	   int cs[]=new int[a.length];
	   cs[0]=a[0];
	   for(int i=1;i<a.length;i++)
	   {
		   cs[i]=cs[i-1]+a[i];
	   }
	   if(p1==0)
	   {
		   System.out.println(cs[p2]);
	   }
	   else
	   {
		   System.out.println(cs[p2]-cs[p1-1]);
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
		 int q=sc.nextInt();
		 for(int i=0;i<q;i++)
		 {
			 int p1=sc.nextInt();
			 int p2=sc.nextInt();
			 prefix(a,p1,p2);
		 }

	 }

}
