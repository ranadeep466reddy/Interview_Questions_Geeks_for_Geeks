import java.util.ArrayList;

public class print_all_nodes_having_k_leafs {
	
	node root;
	public class node
	{
		node left, right;
		int data;
		node(int item)
		{
			data = item;
			left = right = null;
		}
	}
	
	public int leafs(node root, int input)
	{
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return 1;
		
		int total = leafs(root.left, input) + leafs(root.right, input);
		
		if(total == input)
			System.out.print(root.data + " ");
		
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print_all_nodes_having_k_leafs tree = new print_all_nodes_having_k_leafs();
		
		tree.root = tree.new node(1);
		tree.root.left = tree.new node(2);
		tree.root.right = tree.new node(4);
		tree.root.left.left = tree.new node(5);
		tree.root.left.right = tree.new node(6);
		tree.root.left.left.left = tree.new node(9);
		tree.root.left.left.right = tree.new node(10);
		tree.root.right.left = tree.new node(7);
		tree.root.right.right = tree.new node(8);
		tree.root.right.left.left = tree.new node(11);
		tree.root.right.left.right = tree.new node(12);
		
		int k = 1;
		
		tree.leafs(tree.root, k);

	}

}
