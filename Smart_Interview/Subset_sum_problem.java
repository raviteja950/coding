package Smart_Interview;
import java.util.*;
public class Subset_sum_problem {
    static boolean subset(int a[],int n,int k)
    {
    	if(k==0)
    	{
    		return true; 
    	}
    	if(n==0 && k!=0)
    	{
    		return false;
    	}
    	if(a[n-1]>k)
    		return subset(a,n-1,k);
    	return subset(a,n-1,k)||subset(a,n-1,k-a[n-1]);
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			if(subset(a,n,k)==true)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}

	}

}
