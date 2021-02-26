package Practice;

import java.util.Scanner;

public class Premutation {
	static void printArray(int a[])
	{
		System.out.println("");
		for(int i=0;i<a.length;i++)
		{
		    System.out.print(a[i]); 
		}
		System.out.println();
		
	}
	static void swap(int a[],int i,int c)
	{
		
		int temp=a[i];
		a[i]=a[c];
		a[c]=temp;
	}
 static void permutation(int a[],int n,int c)
 {
	 if(c==a.length-1)
	 {
		 printArray(a);
	 }
	 
	 for(int i=c;i<n;i++)
	 {
		 //if(a[i]!=a[c]) //this is for duplicate in an array
		 {
		 swap(a,i,c);
		 permutation(a,n,c+1);
		 swap(a,i,c);
		 }
	 }
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int c=0;
		permutation(a,n,c);

	}

}
