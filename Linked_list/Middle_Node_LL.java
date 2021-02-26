package Linked_list;
import java.util.*;

class node7
{
	int data;
	node7 next;
	node7(int x)
	{
		this.data=x;
		this.next=null;
	}
}


public class Middle_Node_LL {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node7 head=new node7(sc.nextInt());
		node7 tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new node7(sc.nextInt());
			tail=tail.next;
		}
		 Middle_Node_LL a=new  Middle_Node_LL();
		 a.display(head);
		a.middle(head,false);
	}	
		 
		void middle(node7 head,boolean flag)
		 {
			 if(head==null)
			 {
				 return ;
			 }
			 node7 s=head;
			 node7 f=head;
			 while(f.next!=null && f.next.next!=null)
			 {
				 s=s.next;
				 f=f.next.next;
			 }
			 if(f.next==null ||flag==true)
			 {
				 System.out.println(s.data);
			 }
			 else
			 {
				 System.out.println(s.next.data);
			 }
		 }
		void display(node7 head)
		{
			node7 current=head;
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
	

}
