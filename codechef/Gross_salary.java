package codechef;

import java.util.Scanner;

public class Gross_salary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		float salary,hra,da,gross;
		salary=sc.nextFloat();
		if(salary<1500)
		{
			hra=salary/10;
			da=(9*salary)/10;
		}
		else
		{
			hra=500;
			da=(98*salary)/100;
		}
		gross=salary+hra+da;
		System.out.println(gross);
		}
	}

	
}
