package codechef;
import java.util.*;
public class Secound_largest {
	public static void main(String[] args)
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	     while(t!=0)
	     {
	    	 int n=3;
	         int a[]=new int[n];
	         for(int i=0;i<n;i++)
	        {
	         a[i]=sc.nextInt();
	        }
	         Arrays.sort(a);
	         System.out.println(a[1]);
	        t--;
	     }
		}
		catch(Exception e)
		{
			
		}
		

	}

}
