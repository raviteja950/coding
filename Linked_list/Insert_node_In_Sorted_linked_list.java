package Linked_list;
import java.util.*;

class node4
{
	int data;
	node4 next;
	node4(int x)
	{
		this.data=x;
		this.next=null;
	}
	node4 insert(node4 head,int x)
	{
		node4 a=new node4(x);
	   node4 current;
		if(head==null || x <= head.data)
		{
			a.next=head;
			//return a;
		}
		else
		{
			current=head;
			while(head.next.data<x)
			{
				head=head.next;
			}
			a.next=head.next;
			head.next=a;
			return current;
		}
		
		
		return head;
	}
	
	void display(node4 head)
	{
		node4 current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	
}






public class Insert_node_In_Sorted_linked_list {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node4 head=new node4(sc.nextInt());
		node4 tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new node4(sc.nextInt());
			tail=tail.next;
		}
		head.insert(head,5);
		head.display(head);

	}

}
