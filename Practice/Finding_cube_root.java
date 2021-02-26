package Practice;
import java.util.*;
public class Finding_cube_root {
    static void cube_root( double x)
    {
    	double l=0;
    	double h=x;
    	double mid;
    	double pre=1e-8;
    	while(h-l>pre)
    	{
    		mid=l+(h-l)/2;
    		if((mid*mid*mid)>x)
    		{
    			h=mid;
    		}
    		else
    		{
    			l=mid;
    		}
    	}
    	System.out.println(l);
    }
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			//for(int i=0;i<n;i++)
			//{
			//	double x=sc.nextDouble();
			////	double res;
			////	res=Math.cbrt(x);
			////	System.out.println((int)res);
			//}
			for(int i=0;i<n;i++)
			{
		    	double x=sc.nextDouble();
		    	cube_root(x);
			}
	}

}
