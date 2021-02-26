package Codeforce;

import java.util.Scanner;

public class Binary_search_CF {
   public static boolean binary(int a[],int n,int x)
   {
	   int l=0;
	   int h=n-1;
	   while(l<=h)
	   {
		   int m=(l+h)/2;
		   if(a[m]==x)
		   {
			   return true;
			  
		   }
		   else if(a[m]<x)
		   {
			l=m+1;   
		   }
		   else if(a[m]>x)
		   {
			   h=m-1;
		   }
		  
	   }
	   return false;
   }
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
		  int x=sc.nextInt();
		  if(binary(a,n,x))
		  {
			  System.out.println("YES");
		  }
		  else
		  {
			  System.out.println("NO");
		  }
		  
		}

	}

}
