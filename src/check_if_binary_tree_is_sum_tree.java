
public class check_if_binary_tree_is_sum_tree {
	node root;
	static int sum = 0;
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
	public static int is_leaf(node n)
	{
		if(n == null)
			return 0;
		if(n.left == null && n.right == null)
			return 1;
		return 0;
	}
	public static int is_Sum(node root)
	{
		int ls, rs;
		if(root == null || is_leaf(root) == 1)
			return 1;
		if(is_Sum(root.left) != 0 && is_Sum(root.right) != 0)
		{
			if(root.left == null)
				ls = 0;
			else if(is_leaf(root.left) != 0)
				ls = root.left.data;
			else
				ls = 2 * (root.left.data);
			
			if(root.right == null)
				rs = 0;
			else if(is_leaf(root.right) != 0)
				rs = root.right.data;
			else
				rs = 2 *(root.right.data);
			
			if(root.data == rs+ls)
				return 1;
			else
				return 0;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check_if_binary_tree_is_sum_tree tree = new check_if_binary_tree_is_sum_tree();
		tree.root = tree.new node(26);
		tree.root.left = tree.new node(10);
		tree.root.right = tree.new node(3);
		tree.root.left.left = tree.new node(4);
		tree.root.left.right = tree.new node(6);
		tree.root.right.right = tree.new node(3);
		
		
		if(tree.is_Sum(tree.root) != 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
