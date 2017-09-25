import java.util.LinkedList;
import java.util.Queue;

public class difference_bw_sums_of_odd_and_even_levels {
	
	node root;
	public class node
	{
		int data;
		node left, right;
		node(int n)
		{
			data = n;
			left = right = null;
		}
	}
	
	public int level(node root)
	{
		if(root == null)
			return 0;
		
		return root.data - level(root.left) - level(root.right);
	}

	public static void main(String[] args) {
		
		difference_bw_sums_of_odd_and_even_levels tree = new difference_bw_sums_of_odd_and_even_levels();
		tree.root = tree.new node(5);
		tree.root.left = tree.new node(2);
		tree.root.right = tree.new node(6);
		tree.root.left.left = tree.new node(1);
		tree.root.left.right = tree.new node(4);
		tree.root.left.right.left = tree.new node(3);
		tree.root.right.right = tree.new node(8);
		tree.root.right.right.left = tree.new node(7);
		tree.root.right.right.right = tree.new node(9);
		int level = 0;
		System.out.println(tree.level(tree.root));

	}

}
