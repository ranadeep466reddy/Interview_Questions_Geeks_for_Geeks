
public class check_if_two_trees_are_mirror {

	node root, root1;
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
	public void in_order(node root)
	{
		if(root == null)
			return;
		in_order(root.left);
		System.out.print(root.data + " ");
		in_order(root.right);
	}
	public boolean is_mirror(node a, node b)
	{
		if(a == null && b == null)
			return true;
		if(a == null || b == null)
			return false;
		
		return (a.data == b.data) && is_mirror(a.left, b.right) && is_mirror(a.right, b.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check_if_two_trees_are_mirror tree = new check_if_two_trees_are_mirror();
		tree.root = tree.new node(1);
		tree.root.left = tree.new node(2);
		tree.root.right = tree.new node(3);
		tree.root.left.left = tree.new node(4);
		tree.root.left.right = tree.new node(5);
		
		//tree.in_order(tree.root);
		
		tree.root1 = tree.new node(1);
		tree.root1.left = tree.new node(3);
		tree.root1.right = tree.new node(2);
		tree.root1.right.left = tree.new node(5);
		tree.root1.right.right = tree.new node(4);
		
		if(tree.is_mirror(tree.root,tree.root1))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
