import java.util.LinkedList;
import java.util.Queue;


public class nodes_at_k_distance_from_root {
	
	node root;
	public class node
	{
		node left, right;
		int key;
		public node(int n)
		{
			key = n;
		}
		
	}
	public void level(node root, int k)
	{
		if(root == null)
			return;
		if(k == 0)
		{
			System.out.print(root.key + " ");	
		}
		else
		{
			level(root.left, k-1);
			level(root.right, k-1);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nodes_at_k_distance_from_root tree = new nodes_at_k_distance_from_root();
		tree.root = tree.new node(1);
		tree.root.left = tree.new node(2);
		tree.root.right = tree.new node(3);
		tree.root.left.left = tree.new node(4);
		tree.root.left.right = tree.new node(5);
		tree.root.right.left = tree.new node(8);
		int k = 2;
		tree.level(tree.root, k);
        
	}

}
