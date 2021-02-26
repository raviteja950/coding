package Linked_list;
import java.util.*;
class node12
{
	int data;
	node12 next;
	node12(int x)
	{
		this.data=x;
		this.next=null;
	}
	
	int size(node12 head)
	{
		int count=0;
		node12 current=head;
		
		while(current!=null)
		{
			count++;
			current=current.next;
			
		}
		return count;
	}
	
}






public class Size_of_Linked_List {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node12 head=new node12(sc.nextInt());
		node12 tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new node12(sc.nextInt());
			tail=tail.next;
		}
			
		System.out.println(head.size(head));

	}

}
