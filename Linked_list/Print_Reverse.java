package Linked_list;
import java.util.*;
class node2
{
	int data;
	node2 next;
	node2(int x)
	{
		this.data=x;
		this.next=null;
	}
	void reverse(node2 head)
	{
		if(head==null)
		{
			return;
		}
		reverse(head.next);
		System.out.print(head.data+" ");
	}
}






public class Print_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node2 head=new node2(sc.nextInt());
		node2 tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new node2(sc.nextInt());
			tail=tail.next;
		}
		head.reverse(head);

	}

}
