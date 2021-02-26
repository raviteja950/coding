package Linked_list;
import java.util.*;
class node3{
	int data;
	node3 next;
	 node3 (int x)
	 {
		this.data=x;
		this.next=null;
	 }
	 int size(node3 head)
	 {
		 node3 current=head;
		 int count=0;
		 while(current!=null)
		 {
			 count++;
			 current=current.next;
		 }
		 return count;
	 }
	 
	 void display(node3 head)
	 {
		 node3 current=head;
		 while(current!=null)
		 {
			 System.out.print(current.data+" ");
			 current=current.next;
		 }
		 System.out.println();
	 }
	  node3 pos(node3 head,int x,int pos)
	 {
		if(pos<0 || pos>size(head))
		{
			return head;
		}
		node3 n=new node3(x);
		node3 current=head;
		if(pos==0)
		{
			n.next=current;
			//current=n;
			return head;
		}
		else
		{
			
		
		while(--pos!=0)
		{
			head=head.next;
		}
		n.next=head.next;
		head.next=n;
		
		
		
		}
		
		return current;
	 }
	 
}







public class Insertnode_at_given_pos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Insertnode_at_given_pos a=new Insertnode_at_given_pos();
		node3 head=new node3(sc.nextInt());
		node3 tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new node3(sc.nextInt());
			tail=tail.next;
		}
		System.out.println(head.size(head));
		head.display(head);
		head.pos(head, 4, 0);
		head.display(head);
		System.out.println(head.size(head));

	}

}
