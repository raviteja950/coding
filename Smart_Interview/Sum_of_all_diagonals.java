package Smart_Interview;

import java.util.Scanner;

public class Sum_of_all_diagonals {
    static void diagonal(int a[][],int n)
    {
    	int sum=0;
    	for(int i=0;i<n/2;i++)
    	{
    		for(int j=i;j<n-i-1;j++)
    		{
    		sum=sum+a[i][j+2];
    	   }
    	}
    	System.out.println(sum);
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		diagonal(a,n);
	}

}
