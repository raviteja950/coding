package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_two_numbers {
    public static boolean oftwo(int a[],int sum,int n)
    {
    	int p1=0;
        int p2=n-1;
        while(p1!=p2)
        {
      	  int s1=(a[p1]+a[p2]);
      	  if((sum-s1)==s1)
      	  {
      		 return true;
      	  }
      	  else if((sum-s1)>s1)
      	  {
      		  p1++;
      	  }
      	  else
      	  {
      		  p2--;
      	  }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
      if(oftwo(a,sum,n))
      {
    	  System.out.println("Yes");
      }
      else
      {
    	  System.out.println("No");
      }
		}
	}

}
