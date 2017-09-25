
public class longest_consecutive_sequence_binary_tree {
	
	node root;
	static int max = 1;
	public class node
	{
		int data;
		node left, right;
		
		node(int d)
		{
			data = d;
			left = right = null;
		}
	}
	
	public int lcs(node root)
	{
		helper(root,1);
		return max;
	}
	
	public void helper(node root, int count)
	{
		if(root == null) return;

		max = Math.max(count, max);

		if(root.left != null)
		helper(root.left, (root.data + 1 == root.left.data) ? count + 1 : 1);

		if(root.right != null)
		helper(root.right, (root.data + 1 == root.right.data) ? count + 1 : 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		longest_consecutive_sequence_binary_tree tree = new longest_consecutive_sequence_binary_tree();
		
		tree.root = tree.new node(6);
		tree.root.right = tree.new node(9);
		tree.root.right.left = tree.new node(7);
		tree.root.right.right = tree.new node(10);
		tree.root.right.right.right = tree.new node(11);
		
		System.out.println(tree.lcs(tree.root));

	}

}
