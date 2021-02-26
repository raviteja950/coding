package Smart_Interview;
import java.util.*;
public class Kadenes_Algo_Max_SubArry_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		int start=0;
		int end=0;
		int s=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int maxs=0;
		for(int i=0;i<n;i++)
		{
			maxs+=a[i];
			if(max<maxs)
			{
				max=maxs;
				start=s;
				end=i;
			}
			if(maxs<0)
			{
				maxs=0;
				s=i+1;
			}
		}
		System.out.println(max+" "+start+" "+end);
		}
	}

}
