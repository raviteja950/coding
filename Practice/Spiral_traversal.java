package Practice;

import java.util.Scanner;

public class Spiral_traversal {
   public static void spiral(int a[][],int m,int n)
   {
	   int t=0;
	   int b=m-1;
	   int l=0;
	   int r=n-1;
	   int dir=0;
	   while(t<=b && l<=r)
	   {
		   if(dir==0)
		   {
			   for(int i=l;i<=r;i++)
			   {
				   System.out.print(a[t][i]+" ");
			   }
			   t++;
			   dir=1;
		   }
		   else if(dir==1)
		   {
			   for(int i=t;i<=b;i++)
			   {
				   System.out.print(a[i][r] +" ");
			   }
			   r--;
			   dir=2;
		   }
		   else if(dir==2)
		   {
			   for(int i=r;i>=l;i--)
			   {
				   System.out.print(a[b][i]+" ");
			   }
			   b--;
			   dir=3;
		   }
		   else if(dir==3)
		   {
			   for(int i=b;i>=t;i--)
			   {
				   System.out.print(a[i][l]+" ");
			   }
			   l++;
			   dir=0;
		   }
			   
			   
	   }
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n,m;
		n=m=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			  a[i][j]=sc.nextInt();	
			}
		}
		spiral(a,m,n);
		
		}

	}

}
