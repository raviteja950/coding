package Hacker_Rank;

import java.util.Scanner;

public class Picking_numbers {
static void picking(int a[],int n)
{
	int f[]=new int[101];
     int res=Integer.MIN_VALUE;
     for(int i=0;i<n;i++)
     {
    	 f[a[i]]++;
     }
     for(int i=1;i<=100;i++)
     {
    	 res=Math.max(res, f[i]+f[i-1]);
     }
     System.out.println(res);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        picking(a,n);
	}

}
