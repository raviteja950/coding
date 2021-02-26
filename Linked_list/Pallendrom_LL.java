package Linked_list;
import java.util.*;
class Noder
{
	int data;
	Noder next;
	Noder(int x)
	{
		this.data=x;
		this.next=null;
	}
}




public class Pallendrom_LL {
	
	void display(Noder head)
	{
		Noder current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	Noder middle(Noder head,boolean flag)
	{
		Noder f=head;
		Noder s=head;
		if(head==null)
		{
			return head;
		}
		while(f.next!=null && f.next.next!=null)
		{
			s=s.next;
			f=f.next.next;
		}
		if(f.next==null || flag==true)
		{
			return s;
		}
		return s.next;
		
	}
	Noder reverse(Noder head)
	{
		Noder pre=null;
		Noder tem;
		while(head!=null)
		{
			tem=head.next;
			head.next=pre;
			pre=head;
			head=tem;
		}
		return pre;
	}
	
	public boolean palendrome(Noder head)
	{
		Noder mid=middle(head,true);
		Noder s=mid.next;
		mid.next=null;
		Noder rev=reverse(s);
		while(head!=null && rev!=null)
		{
			if(head.data==rev.data)
			{
				head=head.next;
				rev=rev.next;
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pallendrom_LL a=new Pallendrom_LL();
		int n=sc.nextInt();
		Noder head=new Noder(sc.nextInt());
		Noder tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new Noder(sc.nextInt());
			tail=tail.next;
		}
		System.out.print("LL is palendrom:"+a.palendrome(head));
	}

}
