
public class binary_tree_to_binary_search_tree {
	
	node root;
	static int i = 0;
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
	public void in(node root)
	{
		if(root == null)
			return;
		in(root.left);
		System.out.print(root.data + " ");
		in(root.right);
	}
	public void inorder(node root, int[] arr)
	{
		if(root == null)
			return;
		inorder(root.left,arr);
		System.out.print(root.data + " ");
		arr[i++] = root.data;
		inorder(root.right,arr);
	}
	public int count(node root)
	{
		if(root == null)
			return 0;
		return count(root.left) + count(root.right) + 1;
	}
	public node array_to_BST(int[] arr, int start, int end)
	{
		if(start > end)
			return null;
			int mid = (start+end)/2;
			node root = new node(arr[mid]);
			System.out.println(root.data);
			root.left = array_to_BST(arr,start,mid-1);
			root.right = array_to_BST(arr,mid+1,end);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		binary_tree_to_binary_search_tree tree = new binary_tree_to_binary_search_tree();
		tree.root = tree.new node(10);
		tree.root.left = tree.new node(30);
		tree.root.right = tree.new node(15);
		tree.root.left.left = tree.new node(20);
		tree.root.right.right = tree.new node(5);
		int c = tree.count(tree.root);
		System.out.println(c);
		int[] arr = new int[c];
		tree.inorder(tree.root, arr);
        //for(int i = 0; i < arr.length; i++)
        	//System.out.print(arr[i] + " ");
        node temp = tree.array_to_BST(arr, 0, arr.length-1);
        System.out.println();
        tree.in(temp);
	}

}
	