package Smart_Interview;
import java.util.*;
public class Unique_element_2_solution {

	public static void main(String[] args) 
	{
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
	            int count;
	            for(int i=0;i<n;i++)
	            {
	            	count=0;
	                    for(int j=0;j<n;j++)
	                    {
	                            if(a[i]==a[j])
	                            {
	                                    count++;
	                            }
	                    }
	            if(count==1)
                {
                        System.out.println(a[i]+" ");
                }
	            }
	}
}
}
