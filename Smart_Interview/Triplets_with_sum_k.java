package Smart_Interview;

import java.util.Scanner;

public class Triplets_with_sum_k {
    static boolean trip(int a[],int n,int m)
    {
    	for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==m)
					{
						return true;
						
					}
					
				}
			}
		}
    	return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		boolean res=trip(a,n,m);
		if(res==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
