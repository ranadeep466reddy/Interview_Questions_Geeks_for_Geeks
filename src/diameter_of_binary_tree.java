
public class diameter_of_binary_tree {
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
	public class Height
	{
		int h;
	}
	public int diameteropt(node root, Height height)
	{
		Height lh = new Height();
		Height rh = new Height();
		if(root == null)
		{
			height.h = 0;
			return 0;
		}
	
		int ldiameter = diameteropt(root.left,lh);
		int rdiameter = diameteropt(root.right,rh);
		
		height.h = Math.max(lh.h, rh.h) + 1;
		return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
		
	}
	
	public int diameter()
	{
		Height height = new Height();
		return diameteropt(root,height);
	}
	
	/*static int height(node n)
    {
        if (n == null)
            return 0;
        return (1 + Math.max(height(n.left), height(n.right)));
    }*/
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		diameter_of_binary_tree tree = new diameter_of_binary_tree();
		tree.root = tree.new node(1);
		tree.root.left = tree.new node(2);
        tree.root.right = tree.new node(3);
        tree.root.left.left = tree.new node(4);
        tree.root.left.right = tree.new node(5);
        
        System.out.println("diameter :" + tree.diameter());

	}

}
