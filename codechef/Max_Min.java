package codechef;
import java.util.*;
public class Max_Min {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int t=sc.nextInt();
	    while(t-->0)
	     {
	    long n=sc.nextLong();
	      int a[]=new int[(int) n];
	    for(int i=0;i<n;i++)
	    {
	    a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    System.out.println(a[(int)(n-2)]);

	}

  }
}