package Smart_Interview;
import java.util.*;
public class Subset_in_array {
    static void subset(int a[],int n)
    {
    	for(int i=0;i<(1<<n);i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			if((i&(i<<j))>0)
    			{
    				//System.out.println(a[i]+" "+a[j]);
    				System.out.print(a[j]+" ");
    			}
    		}
    		System.out.println();
    	}
    	
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
		 subset(a,n);

	}

}
