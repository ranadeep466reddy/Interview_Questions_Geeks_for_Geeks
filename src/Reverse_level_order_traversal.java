import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_level_order_traversal {
	
	node root;
	class node
	{
		int data;
		node left, right;
		node(int d)
		{
			data = d;
			left = right = null;
		}
	}
	
	public void reverse(node root)
	{
		
		if(root == null)
			return;
		
		Queue<node> queue = new LinkedList<>();
		Stack<node> stack = new Stack<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			node temp = queue.poll();
			
			if(temp.right != null)
				queue.offer(temp.right);
			
			if(temp.left != null)
				queue.offer(temp.left);
			
			stack.push(temp);
		}
		
		while(stack.size() > 0)
		{
			System.out.print(stack.pop().data + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_level_order_traversal tree = new Reverse_level_order_traversal();
		
		tree.root = tree.new node(10);
		tree.root.left = tree.new node(20);
		tree.root.right = tree.new node(30);
		tree.root.left.left = tree.new node(40);
		tree.root.left.right = tree.new node(50);
		tree.root.right.left = tree.new node(60);
		tree.root.right.right = tree.new node(70);
		
		tree.reverse(tree.root);

	}

}
