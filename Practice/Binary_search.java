package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
    
   static void binary_search_iterative(int a[],int n,int m)
   {
	 
	  Arrays.sort(a);
	  int l=0;
	  int h=n-1;
	  while(l<=h)
	  {
		int mid=(l+h)/2;
		if(a[mid]==m)
		{
			System.out.println(mid);
			break;
		}
		else if(a[mid]<m)
		{
			l=mid+1;
		}
		else
		{
			h=mid-1;
		}
	  }
   }
   static int binary_search_recursive(int a[],int n,int m,int l,int h)
   {
	  if(l>h)
	  {
		  return -1;
	  }
	  int mid=(l+h)/2;
	  if(mid==m)
		  return mid;
	  if(a[mid]<m)
		  return binary_search_recursive(a,n,m,m+1,h);
	  else
		  return binary_search_recursive(a,n,m,m-1,l);
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
		int m=sc.nextInt();
		binary_search_iterative(a,n,m); 
 		binary_search_recursive(a,n,m,0,n-1);
	}
		
}


