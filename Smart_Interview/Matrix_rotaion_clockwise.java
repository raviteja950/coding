package Smart_Interview;

import java.util.Scanner;

public class Matrix_rotaion_clockwise {
   public  static void swap(int a[][],int n)
    {
    	for(int j=0;j<n;j++)
    	{
    		for(int i=n-1;i>=0;i--)
    		{
    			System.out.print(a[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=1;k<=t;k++)
		{
			int n=sc.nextInt();
			int a[][]=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Test Case #"+ k +":"); 
			swap(a,n);
					
		}
		

	}

}
