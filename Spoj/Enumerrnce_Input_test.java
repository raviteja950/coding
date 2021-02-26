package Spoj;
import java.util.Scanner;
public class Enumerrnce_Input_test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		while(n-->0)
		{
			int num=sc.nextInt();
			if(num%k==0)
			{
				count++;
			}
		}
		System.out.println(count);
				

	}

}
