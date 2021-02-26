package codechef;

import java.util.Scanner;

public class Decrement_or_Increment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N%4==0)
		{
			N++;
		}
		else
		{
			N--;
		}
		System.out.println(N);
				

	}

}
