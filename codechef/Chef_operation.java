package codechef;

import java.util.Scanner;

public class Chef_operation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1<n2)
		{
			System.out.println("<");
		}
		else if(n1>n2)
		{
			System.out.println(">");
		}
		else
		{
			System.out.println("=");
		}
	}
	}

}
