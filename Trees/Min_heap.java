package Trees;
import java.util.*;
public class Min_heap {
    static PriorityQueue<Integer>q=new PriorityQueue<>();
    static void insert(int n)
    {
    	if(q.isEmpty())
    	{
    		q.add(n);
    	}
    	else
    	{
    		q.add(n);
    	}
    }
    static int getmin()
    {
    	if(q.isEmpty())
    	{
    		return 0;
    	}
    	return q.peek();
    }
    static void delmin()
    {
    	q.remove(q.poll());
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
		 String s=sc.next();
		   switch(s)
		   {
		   case "insert":
		   {
			   int x=sc.nextInt();
			   insert(x);
			   break;
		   }
		   case "getmin":
		   {
			   int f=getmin();
			   if(getmin()==0)
			   {
				   System.out.print("Empty");
			   }
			   else
			   {
				   System.out.print(f);
			   }
		   }
		   case "delmin":
		   {
			   delmin();
		   }
		   
		   }
		
	}

}
}