package Practice;

import java.util.Scanner;

public class Reverse_bit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0)
		
	{
		int res=n%10;
		n=n/10;
		System.out.println(res);
	}

	}

}
