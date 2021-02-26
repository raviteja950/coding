package Smart_Interview;
import java.util.*;
import java.util.Scanner;

public class Big_Sorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a[]=new int[t];
			for(int j=0;j<a.length;j++)
			{
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			for(int k=0;k<a.length;k++)
			{
				System.out.println(a[i]);
			}
		}

	}

}
