package Smart_Interview;

import java.util.Scanner;

public class Fibonacci_series {
static int fibonacci(int n)
{
	if(n==1 || n==2)
	{
		return 1;
	}
	return fibonacci(n-1)+fibonacci(n-2);
}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=fibonacci(n);
System.out.println(f);
	}

}
