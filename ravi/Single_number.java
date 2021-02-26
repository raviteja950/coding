package ravi;
import java.util.ArrayList;
import java.util.Scanner;

public class Single_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList a=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			//int n=sc.nextInt();
			a.add(sc.nextInt());
		}
		int count=0;
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<a.size();j++)
			{
			if(a.indexOf(i)==a.indexOf(j) && i!=j )
			{
				count++;
			}
			}
			if(count==0)
			{
				System.out.println(a);
			}
		}
	}
}
