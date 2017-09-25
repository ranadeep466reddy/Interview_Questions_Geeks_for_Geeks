import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class top_view_of_binary_tree {
	
	    Node root;
	    public class Node
	    {
	    	int data;
	    	Node left, right;
	    	Node(int d)
	    	{
	    		data = d;
	    		left = right = null;
	    	}
	    }
	    public class Qitem
	    {
	    	int hd;
	    	Node n;
	    	Qitem(Node n, int hd)
	    	{
	    		this.n = n;
	    		this.hd = hd;
	    	}
	    }
	    
	    public void top(Node root)
	    {
	    	if(root == null)
	    		return;
	    	HashSet<Integer> set = new HashSet<Integer>();
	    	Queue<Qitem> queue = new LinkedList<Qitem>();
	    	
	    	queue.add(new Qitem(root, 0));
	    	
	    	while(!queue.isEmpty())
	    	{
	    		Qitem temp = queue.poll();
	    		int hd = temp.hd;
	    		Node t = temp.n;
	    		
	    		if(!set.contains(hd))
	    		{
	    			System.out.print(t.data + " ");
	    			set.add(hd);
	    		}
	    			
	    		
	    		if(t.left != null)
	    			queue.add(new Qitem(t.left, hd-1));
	    		
	    		if(t.right != null)
	    			queue.add(new Qitem(t.right, hd+1));
	    	}
	    }

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		top_view_of_binary_tree tree = new top_view_of_binary_tree();
		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.right = tree.new Node(4);
        tree.root.left.right.right = tree.new Node(5);
        tree.root.left.right.right.right = tree.new Node(6);

		tree.top(tree.root);

	}

}
