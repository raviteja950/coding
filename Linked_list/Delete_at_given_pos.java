package Linked_list;
import java.util.*;
class node5
{
	int data;
	node5 next;
	node5 (int x)
	{
		this.data=x;
		this.next=null;
	}
	int size(node5 head)
	{
		int count=0;
				node5 current=head;
				while(current!=null)
				{
					count++;
					current=current.next;
					
				}
				return count;
	}
	
	node5 delete(node5 head,int pos)
	{
	    if(pos==0 || pos>=size(head))
	    {
	    	return head;
	    }
	    if(pos==0)
	    {
	    	return head.next;
	    }
	    
	    else
	    {
	    	node5 current=head;
	    	
	    	while(--pos!=0)
	    	{
	    		head=head.next;
	    	}
	    	head.next=head.next.next;
	    	return current;
	    }
		
		
	}
	void display(node5 head)
	{
		node5 current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
}





public class Delete_at_given_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       node5 head=new node5(sc.nextInt());
       node5 tail=head;
       for(int i=0;i<n-1;i++)
       {
    	   tail.next=new node5(sc.nextInt());
    	   tail=tail.next;
       }
       head.delete(head, 2);
       head.display(head);
       
	}

}
