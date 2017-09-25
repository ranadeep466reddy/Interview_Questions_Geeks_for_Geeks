
public class print_all_nodes_that_do_not_have_sibling {

	node root;
	public class node
	{
		int data;
		node left, right;
		public node(int n)
		{
			data = n;
			left = right = null;
		}
	}
	public void sibling(node root)
	{
		if(root == null)
			return;
		if(root.left != null && root.right != null)
		{
			sibling(root.left);
			sibling(root.right);
		}
		else if(root.left != null)
		{
			System.out.print(root.left.data + " ");
			sibling(root.left);
		}
			
		else if(root.right != null)
		{
			System.out.print(root.right.data + " ");
			sibling(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print_all_nodes_that_do_not_have_sibling tree = new print_all_nodes_that_do_not_have_sibling();
		tree.root = tree.new node(1);
		tree.root.left = tree.new node(2);
		tree.root.right = tree.new node(3);
		tree.root.left.right = tree.new node(4);
		tree.root.right.left = tree.new node(5);
		tree.root.right.left.left = tree.new node(6);
		
		tree.sibling(tree.root);
	}

}
