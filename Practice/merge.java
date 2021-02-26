package Practice;

import java.util.Scanner;

public class merge {
    static void merge(int a[],int b[],int n,int m)
    {
    	int count[]=new int[n+m];
    	int p=0;
    	int p1=0;
    	
    	int k=0;
    	while(p<n && p1<m)
    	{
    		if(a[p]>b[p1])
    		{
    		count[k++]=a[p1++];
    		}
    		else
    		{
    			count[k++]=b[p++];
    		}
    	}
    	while(p<n)
    	{
    		count[k++]=a[p++];
    	}
    	while(p1<m)
    	{
           count[k++]=a[p1++];
    	}
    	for(int i=0;i<n+m;i++)
    	{
    		System.out.print(count[i]+" ");
    	}
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the 1st n value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array element");
	    for(int i=0;i<n;i++)
	    {
		  a[i]=sc.nextInt();
	    }
	    System.out.println("enter the 2nd m value");
	    int m=sc.nextInt();
	    int b[]=new int[m];
	    System.out.println("enter the array element");
	    for(int i=0;i<m;i++)
	    {
	    	b[i]=sc.nextInt();
	    }
		
		merge(a,b,n,m);
	}

}
