package Practice;
import java.util.*;
public class MaxiMum_xor {
    static int xor(int a[],int l)
    {
    	int max=0;
    	int mas=0;
    	HashSet<Integer>se=new HashSet<Integer>();
    	for(int i=30;i>=0;i--)
    	{
    		mas|=(1<<i);
    		for(int j=0;j<l;j++)
    		{
    			se.add(a[j] & mas);
    		}
    		int newmax=max|(1<<i);
    		for(int p:se)
    		{
    			if(se.contains(newmax^p))
    			{
    				max=newmax;
    				break;
    			}
    		}
    		se.clear();
    		}
    	return max;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int l=a.length;
		System.out.println(xor(a,l));
		}
	}

}
