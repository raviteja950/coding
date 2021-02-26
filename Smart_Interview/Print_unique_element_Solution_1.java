package Smart_Interview;

import java.util.Scanner;

public class Print_unique_element_Solution_1 {
	static int unique(int a[],int n)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			res^=a[i];
		}
		return res;
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
        	  System.out.println(unique(a,n));
	
         }
}
