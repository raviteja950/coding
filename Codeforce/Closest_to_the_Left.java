package Codeforce;

import java.util.Scanner;

public class Closest_to_the_Left {

	
		

		 public static int left(int a[],int n,int x)
		   {
			   int l=-1;
			   int h=n;
			   while(h>l+1)
			   {
				   int m=(l+h)/2;
				  if(a[m]<x)
				  {
					  l=m;
				  }
				  else
				  {
					  h=m;
				  }
				  
			   }
			   return h+1;
			 
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
				int res=0;
				for(int i=0;i<m;i++)
				{
				  int x=sc.nextInt();
				   res=left(a,n,x);
				   System.out.println(res);
				}
				

			}

		}