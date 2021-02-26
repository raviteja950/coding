package Smart_Interview;

import java.util.Scanner;

public class Number_of_divisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n/i;i++)
		{
			if(n%i==0)
			{
				c++;
			}
			else
			{
				c+=2;
			}
			
		}
		System.out.println(c);

	}

}
