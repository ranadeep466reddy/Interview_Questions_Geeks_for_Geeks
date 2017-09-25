import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class print_tree_vertical_order {
	
	node root;
	public class node
	{
		node left, right;
		int data;
		
		node(int item)
		{
			data = item;
			left = right = null;
		}
	}
	
	void verticaleOrder(node root) {
		
		if(root == null)
			return;
		
		Queue<node> queue = new LinkedList<node>();
		Queue<Integer> distanceQueue = new LinkedList<Integer>();
		
		TreeMap<Integer, LinkedList<node>> distanceMap = new TreeMap<>();
		
		distanceQueue.add(0);
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			node temp = queue.poll();
			int distance = distanceQueue.poll();
			
			if(distanceMap.get(distance) == null)
				distanceMap.put(distance, new LinkedList<node>());
			
			distanceMap.get(distance).add(temp);
			
			if(temp.left != null)
			{
				queue.add(temp.left);
				distanceQueue.add(distance-1);
			}
			
			if(temp.right != null)
			{
				queue.add(temp.right);
				distanceQueue.add(distance+1);
			}
		}
		printVerticaleOrder(distanceMap);
	}

		

	void printVerticaleOrder(TreeMap<Integer, LinkedList<node>> distanceMap) {
		
		for(int key : distanceMap.keySet())
		{
			for(node n : distanceMap.get(key))
			{
				System.out.print(n.data + " ");
			}
			System.out.println(" ");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print_tree_vertical_order tree = new print_tree_vertical_order();
		
		tree.root = tree.new node(1);
		tree.root.left = tree.new node(2);
		tree.root.right = tree.new node(3);
		tree.root.left.left = tree.new node(4);
		tree.root.left.right = tree.new node(5);
		tree.root.right.left = tree.new node(6);
		tree.root.right.right = tree.new node(7);
		tree.root.right.left.right = tree.new node(8);
		tree.root.right.right.right = tree.new node(9);
		tree.root.right.right.left = tree.new node(10);
		tree.root.right.right.left.right = tree.new node(11);
		tree.root.right.right.left.right.right = tree.new node(12);
		
		tree.verticaleOrder(tree.root);

	}

}
