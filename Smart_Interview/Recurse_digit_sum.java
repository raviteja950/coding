package Smart_Interview;

import java.util.Scanner;

public class Recurse_digit_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		sum=(n*k)%9;
		System.out.println(sum==0 ? 9 : sum);
		//System.out.println(sum);

	}

}
