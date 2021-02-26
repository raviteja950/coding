package Binary_search;

import java.util.Scanner;

public class Rotate_array {
    static void rotate(int a[],int n)
    {
    	int l=0;
    	int h=n-1;
    	while(l<=h)
    	{
    		int m=(l+h)/2;
    		if(a[m]<a[h])
    		{
    			h=m;
    		}
    		else
    		{
    			l=m+1;
    		}
    	}
    	System.out.print(l);
		
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
		
       rotate(a,n);
       
	}

}
