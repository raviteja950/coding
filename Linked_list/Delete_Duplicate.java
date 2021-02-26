package Linked_list;
import java.util.*;
class ravi
{
	int data;
	ravi next;
	ravi(int x)
	{
		this.data=x;
		this.next=null;
	}
}


public class Delete_Duplicate {

	ravi dupliacte(ravi head)
	{
		if(head==null)
		{
			return head;
		}
		while(head.next!=null)
		{
			if(head.data==head.next.data)
			{
				head.next=head.next.next;
			}
			else
			{
				head=head.next;
			}
		}
		
		return head;
	}
	void display(ravi head)
	{
		ravi current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ravi head=new ravi(sc.nextInt());
		ravi tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new ravi(sc.nextInt());
			tail=tail.next;
		}
		
		Delete_Duplicate a=new Delete_Duplicate();
		a.dupliacte(head);
		a.display(head);

	}

}
