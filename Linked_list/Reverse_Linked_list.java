package Linked_list;
import java.util.*;
class node6
{
	int data;
	node6 next;
	
	node6(int x)
	{
		this.data=x;
		this.next=null;			
	}
}






public class Reverse_Linked_list {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node6 head=new node6(sc.nextInt());
		node6 tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new node6(sc.nextInt());
			tail=tail.next;
		}
		Reverse_Linked_list  a=new Reverse_Linked_list(); 
		head=a.reverse(head);
        a.display(head);
	}

	 node6 reverse(node6 head) {
		
		node6 pre=null,tem;
		while(head!=null)
		{
			tem=head.next;
			head.next=pre;
			pre=head;
			head=tem;
		}
		return pre;
		
	}
		void display(node6 head)
		{
			node6 current=head;
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}

}
