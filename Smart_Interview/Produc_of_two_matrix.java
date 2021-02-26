package Smart_Interview;

import java.util.Scanner;

public class Produc_of_two_matrix {
static void product(int a[][],int b[][],int n1,int n2,int n3,int n4)
{
	int p[][]=new int[n1][n4];
	for(int i=0;i<n1;i++)
	{
		for(int j=0;j<n4;j++)
		{
			for(int k=0;k<n3;k++)
			{
			p[i][j]=p[i][j]+a[i][k]*b[k][j];
			}
		}
	}
	for(int i=0;i<n1;i++)
	{
		for(int j=0;j<n4;j++)
		{
			System.out.print(p[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		System.out.println("matrix 1 index");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[][]=new int[n1][n2];
		System.out.println("enter 1st Matrix");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix 2 index");
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		System.out.println("matrix 2 element");
		int b[][]=new int[n3][n4];
		for(int i=0;i<n3;i++)
		{
			for(int j=0;j<n4;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		product(a,b,n1,n2,n3,n4);
		}
	}

}
