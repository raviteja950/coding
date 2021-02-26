package Practice;
import java.util.*;
public class Find_the_celli {
    public static int celli(int a[],int x)
    {
    	int l=0;
    	int h=a.length-1;
    	int ans=2147483647;
    	while(l<=h)
    	{
    		int m=(l+h)/2;
    		if(x==a[m])
    		{
    			return a[m];
    		}
    		else if(x>a[m])
    		{
    			l=m+1;
    		}
    		else
    		{
    			ans=Math.min(ans, a[m]);
    			h=m-1;
    		}
    	}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int x=sc.nextInt();
			System.out.println(celli(a,x));
		}

	}

}
