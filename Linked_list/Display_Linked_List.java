package Linked_list;

import java.util.Scanner;

class node
{
	int data;
	node next;
	node(int x)
	{
		this.data=x;
		this.next=null;
	}
	
	
	void print(node h)
	{
		node current=h;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
		
	}
	
}




public class Display_Linked_List {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node head=new node(sc.nextInt());
		node tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new node(sc.nextInt());
			tail=tail.next;
		}
		head.print(head);

	}

}
