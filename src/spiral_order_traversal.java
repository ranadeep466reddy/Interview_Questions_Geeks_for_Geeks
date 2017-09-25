import java.util.Stack;

public class spiral_order_traversal {
	
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
	
	public void spiral()
	{
		Stack<node> stack1 = new Stack<node>();
		Stack<node> stack2 = new Stack<node>();
		
		stack1.push(root);
		
		while(!stack1.isEmpty() || !stack2.isEmpty()){
			
			while(!stack1.isEmpty()){
				node temp = stack1.peek();
				stack1.pop();
				
				System.out.print(temp.data + " ");
				
				if(temp.left != null)
					stack2.push(temp.left);
				
				if(temp.right != null)
					stack2.push(temp.right);
				}
			
			while(!stack2.isEmpty()){
				node temp = stack2.peek();
				stack2.pop();
				
				System.out.print(temp.data + " ");
				
				if(temp.right != null)
					stack1.push(temp.right);
				
				if(temp.left != null)
					stack1.push(temp.left);
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		spiral_order_traversal tree = new spiral_order_traversal();
		tree.root = tree.new node(1);
		tree.root.left = tree.new node(2);
		tree.root.right = tree.new node(3);
		tree.root.left.left = tree.new node(7);
		tree.root.left.right = tree.new node(6);
		tree.root.right.left = tree.new node(5);
		tree.root.right.right = tree.new node(4);
		
		tree.spiral();
	}

}
