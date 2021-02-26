package codechef;

import java.util.Scanner;

public class Total_expences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		float n=sc.nextInt();
		float m=sc.nextInt();
		if(n>1000)
		{
			System.out.println(n*m-(n*m*0.1));
		}
		else
		{
			System.out.println(n*m);
		}
		}
	}

}
