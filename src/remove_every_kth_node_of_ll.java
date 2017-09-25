
public class remove_every_kth_node_of_ll {
	
	node head;
	public class node
	{
		int data;
		node next;
		node(int n)
		{
			data = n;
			next = null;
		}
	}
	 
	
	public void add(int n)
	{
		node new_node = new node(n);
		new_node.next = head;
		head = new_node;
	}
	
	public void print()
	{
		node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void remove(int k)
	{
		node prev;
		node temp = head;
		int count = 0;
		
		while(temp != null)
		{
			prev = temp;
			temp = temp.next;
			count++;
			if(count == k && temp != null)
			{
				temp = temp.next;
				prev.next = temp;
				count = 0;
			}
		}
		System.out.println();
		print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		remove_every_kth_node_of_ll l = new remove_every_kth_node_of_ll();
		
		l.add(8);
		l.add(7);
		l.add(6);
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
		
		l.print();
		
		int k = 3;
		
		l.remove(k);

	}

}
