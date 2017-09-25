
public class Expression_Tree {
	
	node root;
	public class node
	{
		String data;
		node left, right;
		node(String data)
		{
			this.data = data;
			left = right = null;
		}
	}
	public boolean is_number(String s)
	{
		try
		{
			Integer.parseInt(s);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	public int calculate(int left, int right, String data)
	{
		switch(data)
		{
		case "+" : 
			return left+right;
		case "-" : 
			return left-right;
		case "%" : 
			return left%right;
		case "*" : 
			return left*right;
		default :
			throw new RuntimeException("Invalid Expression");
		}
	}
	
	public int expression(node root)
	{
		if(root == null)
			return 0;
		int left, right;
		left = expression(root.left);
		right = expression(root.right);
		
		if(!is_number(root.data))
		{
			return calculate(left,right,root.data);
		}
		
		return Integer.parseInt(root.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Expression_Tree tree = new Expression_Tree();
		tree.root = tree.new node("+");
		tree.root.left = tree.new node("*");
		tree.root.right = tree.new node("-");
		tree.root.left.left = tree.new node("5");
		tree.root.left.right = tree.new node("4");
		tree.root.right.left = tree.new node("100");
		tree.root.right.right = tree.new node("20");
		
		System.out.println(tree.expression(tree.root));

	}

}
