import java.util.ArrayList;

public class root_to_leaf_path_equal_to_given_number {
	
	node root;
	public class node
	{
		int data;
		node left, right;
		node(int item)
		{
			data = item;
			left = right = null;
		}
	}
	
	public boolean sum(node root, int sum, ArrayList<node> result)
	{
		if(root == null)
			return false;
		
		if(root.left == null && root.right == null)
		{
			if(root.data == sum)
			{
				result.add(root);
				return true;
			}
		}
		
		if(sum(root.left, sum-root.data, result) || sum(root.left, sum-root.data, result))
		{
			result.add(root);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
root_to_leaf_path_equal_to_given_number tree = new root_to_leaf_path_equal_to_given_number();
		
		int sum = 21;
		tree.root = tree.new node(10);
		tree.root.left = tree.new node(8);
		tree.root.right = tree.new node(2);
		tree.root.left.left = tree.new node(3);
		tree.root.left.right = tree.new node(5);
		tree.root.right.left = tree.new node(2);
		
		ArrayList<node> list = new ArrayList<>();
		
		if(tree.sum(tree.root, sum, list))
		{
			for(int i = 0; i < list.size(); i++)
			{
				node temp = list.get(i);
				System.out.print(temp.data + " ");
			}
		}

	}

}
