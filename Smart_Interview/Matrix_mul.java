package Smart_Interview;
import java.util.*;
public class Matrix_mul {
    static void mul(int a[][],int b[][],int r1,int c1,int r2,int c2)
    {
    	int sum=0;
    	for(int i=0;i<r1;i++)
    	{
    		for(int j=0;j<c2;j++)
    		{
    			for(int k=0;k<r2;k++)
    			{
    			sum+=a[i][k]*b[k][j];
    		    }
    	  }
    	}
    	System.out.println(sum);
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        while(t-->0)
        {
        	int r1=sc.nextInt();
        	int c1=sc.nextInt();
        	int a[][]=new int[r1][c1];
        	for(int i=0;i<r1;i++)
        	{
        		for(int j=0;j<c1;j++)
        		{
        			a[i][j]=sc.nextInt();
        		}
        	}
        	int r2=sc.nextInt();
        	int c2=sc.nextInt();
        	int b[][]=new int[r2][c2];
        	for(int i=0;i<r2;i++)
        	{
        		for(int j=0;j<c2;j++)
        		{
        			b[i][j]=sc.nextInt();
        					
        		}
        	}
        	mul(a,b,r1,c1,r2,c2);
        }
	}

}
