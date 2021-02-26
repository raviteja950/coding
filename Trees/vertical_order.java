package Trees;
import java.util.*;
class node2
{
	int data;
	node2 left;
	node2 right;
	node2(int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
	}
	
}



public class vertical_order {
   static int min=0; 
    static void vertical(node2 root,int hd,HashMap<Integer, ArrayList<Integer>> hm)
    {
    	if(root==null) return;
    	if(!hm.containsKey(hd))
    	{
    		ArrayList<Integer>l=new ArrayList<Integer>();
    		l.add(root.data);
    		hm.put(hd,l);
    	}
    	else
    	{
    		ArrayList<Integer> b=new ArrayList<>();
    		b=hm.get(hd);
    		b.add(root.data);
    		hm.put(hd,b);
    	}
    	min=Math.min(min, hd);
    	vertical(root.left,hd-1,hm);
    	vertical(root.right,hd+1,hm);
    	
    	
    }
    
    
	static node2 insert(node2 root,int x)
    {
    	if(root==null)return new node2(x);
    	if(x<root.data)
    	{
    		root.left=insert(root.left,x);
    	}
    	else
    	{
    		root.right=insert(root.right,x);
    	}
    	return root;		
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node2 root=null;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=insert(root,x);
		} 
		HashMap<Integer,ArrayList<Integer>>hm=new HashMap<Integer,ArrayList<Integer>>();
		vertical(root,0,hm);
        int k=min;
        while(hm.containsKey(k))
        {
        	ArrayList<Integer>ar=new ArrayList<>();
        	ar=hm.get(k);
        	Collections.sort(ar);
        	for(int i=0;i<ar.size();i++)
        	{
        		System.out.print(ar.get(i)+" ");
        	}
        	System.out.println();
        	k++;
        }
        min=0;
	}

}
