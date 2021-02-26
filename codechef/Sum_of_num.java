package codechef;
import java.util.*;
public class Sum_of_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int sum=0;
			int n=sc.nextInt();
			while(n!=0)
			{
			sum=sum+n%10;
			n=n/10;
			}
			System.out.println(sum);
		}
	}

}
