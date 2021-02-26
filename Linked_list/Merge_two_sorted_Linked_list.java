package Linked_list;
import java.util.*;
class node8
{
	int data;
	node8 next;
	node8(int x)
	{
		this.data=x;
		this.next=null;
	}
		
}




public class Merge_two_sorted_Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Fisrt head");
        node8 head1=new node8(sc.nextInt());
        node8 tail1=head1;
        for(int i=0;i<n-1;i++)
        {
        	tail1.next=new node8(sc.nextInt());
        	tail1=tail1.next;
        }
        int m=sc.nextInt();
        System.out.println("secount head");
        node8 head2=new node8(sc.nextInt());
        node8 tail2=head2;
        for(int i=0;i<m-1;i++)
        {
        	tail2.next=new node8(sc.nextInt());
        	tail2=tail2.next;
        }
        Merge_two_sorted_Linked_list f=new Merge_two_sorted_Linked_list();
       
        f.merge(head1, head2);
        f.display(head1);
	}
	
	
	void display(node8 head)
	{
		node8 current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	node8 merge(node8 head1,node8 head2)
	{
		node8 d=new node8(0);
		node8 current=d;
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
				if(head2!=null)
				{
					d.next=head2;
				}
		
		
		return current.next;
	}

}
