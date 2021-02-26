package Trees;
import java.util.*;
public class Min_cost_to_connect_rods {
  static int min(int a[],int n)
  {
	  int mn=Integer.MAX_VALUE;
	  int sum=0;
	  for(int i=0;i<n;i++)
	  {
		  mn=Math.min(a[i], mn);
		  sum+=a[i];
	  }
	  return mn*(sum-mn);
		  
  }
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        System.out.println(min(a,a.length));
	}

}
