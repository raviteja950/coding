package Linked_list;
import java.util.*;
class NODE1
{
	int data;
	NODE1 next;
	NODE1(int x)
	{
	   this.data=x;
	   this.next=null;
	}

}
public class Detect_loop_LL {
	int loop( NODE1 head)
	{
		NODE1 s=head;
		NODE1 f=head;
		while(s!=null && f!=null && f.next!=null)
		{
			s=s.next;
			f=f.next.next;
			if(s==f)
			{
				return s.data;
			}
		}
		
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NODE1 head=new NODE1(sc.nextInt());
		NODE1 tail=head;
		tail.next=new NODE1(sc.nextInt());
		tail.next.next=new NODE1(sc.nextInt());
		tail.next.next.next=new NODE1(sc.nextInt());
		tail.next.next.next.next=new NODE1(sc.nextInt());
		tail.next.next.next.next=tail.next.next;
		Detect_loop_LL a=new Detect_loop_LL();
		int res=a.loop(head);
		if(res==1)
		{
			System.out.println("NO loop");
		}
		else
		{
			System.out.println("Loop");
		}
       
	}

}
