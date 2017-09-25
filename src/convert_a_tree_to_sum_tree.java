
public class convert_a_tree_to_sum_tree {
	
	Node root;
	public class Node
	{
		int data;
		Node left,right;
		Node(int n)
		{
			data = n;
			left = right = null;
		}
	}
	public int sum(Node root)
	{
		if(root == null)
			return 0;
		int old = root.data;
		root.data = sum(root.left) + sum(root.right);
		return old+root.data;
	}
	public void inorder(Node root)
	{
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		convert_a_tree_to_sum_tree tree = new convert_a_tree_to_sum_tree();
		tree.root = tree.new Node(10);
        tree.root.left = tree.new Node(-2);
        tree.root.right = tree.new Node(6);
        tree.root.left.left = tree.new Node(8);
        tree.root.left.right = tree.new Node(-4);
        tree.root.right.left = tree.new Node(7);
        tree.root.right.right = tree.new Node(5);
        
        tree.sum(tree.root);
        tree.inorder(tree.root);

	}

}
