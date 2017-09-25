import java.util.Deque;
import java.util.LinkedList;

public class spiral_form_using_dequeue {
	
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
	
	public void spiral(node root)
	{
		if(root == null)
			return;
		
		Deque<node> deque = new LinkedList<node>();
		
		deque.offerFirst(root);
		int count = 1;
		boolean flag = true;
		
		while(!deque.isEmpty())
		{
			int curr = 0;
			while(count > 0)
			{	
				if(flag)
				{
					node temp = deque.pollFirst();
					System.out.print(temp.data + " ");
					
					if(temp.left != null)
					{
						deque.offerLast(temp.left);
						curr++;
					}
					
					if(temp.right != null)
					{
						deque.offerLast(temp.right);
						curr++;
					}	
				}
				else
				{
					node temp = deque.pollLast();
					System.out.print(temp.data + " ");
					
					if(temp.right != null)
					{
						deque.offerFirst(temp.right);
						curr++;
					}
					
					if(temp.left != null)
					{
						deque.offerFirst(temp.left);
						curr++;
					}
				}
				count--;
			}
			count = curr;
			flag = !flag;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		spiral_form_using_dequeue tree = new spiral_form_using_dequeue();
		tree.root = tree.new node(1);
		tree.root.left = tree.new node(2);
		tree.root.right = tree.new node(3);
		tree.root.left.left = tree.new node(7);
		tree.root.left.right = tree.new node(6);
		tree.root.right.left = tree.new node(5);
		tree.root.right.right = tree.new node(4);
		
		tree.spiral(tree.root);

	}

}
