package Linked_list;
import java.util.*;
class node9
{
	int data;
	node9 next;
	node9(int x)
	{
		this.data=x;
		this.next=null;
	}
	
}



public class Merge_sort_LL
{

				public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					int n=sc.nextInt();
						node9 head=new node9(sc.nextInt());
						node9 tail=head;
						for(int i=0;i<n-1;i++)
						{
							tail.next=new node9(sc.nextInt());
							tail=tail.next;
						}
						Merge_sort_LL a=new Merge_sort_LL();
				
						a.merge1(head);
						a.display(head);
				}
	
	
	
						node9 middle(node9 head,boolean flag)
						{
							if(head==null)
							{
								return head;
							}
							node9 f=head;
							node9 s=head;
							while(f.next!=null && f.next.next!=null)
							{
								s=s.next;
								f=f.next.next;
							}
							if(f.next==null || flag==true)
							{
								return s;
							}
							else
							{
							return s.next;}
						}
	
	
	
	node9 merge1(node9 head)
	{
		if(head.next==null)
		{
			return head;
		}
		node9 mid=middle(head,true);
		node9 sh=mid.next;
		mid.next=null;
		return mergesort(merge1(head),merge1(sh));
	}
	node9 mergesort(node9 head1 ,node9 head2)
	{
		node9 d=new node9(0);
		node9 current=d;
		while(head1!=null && head2!=null)
		{
			if(head1.data<head2.data)
			{
				d.next=head1;
				head1=head1.next;
			}
			else
			{
				d.next=head2;
				head2=head2.next;
			}
			d=d.next;
		}
		if(head1!=null)
		{
			d.next=head1;
		}
		else
		{
			d.next=head2;
		}
		return current.next;
	}
	void display(node9 head)
	{
		node9 current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
				
	}



}



