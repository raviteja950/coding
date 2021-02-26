package Stack;

import java.util.Scanner;

public class Stack_implement {

	int top=-1;
	int max=100;
	int a[]=new int[max];
	

public void insert(int x)
{
	if(top>=max)
	{
		return;
	}
	top++;
	a[top]=x;
}

public int pop()
{
	if(top<0)
	{
		System.out.println("Empty");
		return Integer.MIN_VALUE;
	}
	return a[top--];
}





	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack_implement a =new Stack_implement();
		int n=sc.nextInt();
		while(n-->0)
		{
				String s=sc.next();
				
				switch(s)
				{
				case "push":
				{
					
						a.insert(sc.nextInt());
						break;
				}
				case "pop":
				{
					
					
						int d=a.pop();
						if(d!=Integer.MIN_VALUE)
						{
							System.out.println(d);
						}
				
				}
				}
				
				
			}
        
	}

	}
