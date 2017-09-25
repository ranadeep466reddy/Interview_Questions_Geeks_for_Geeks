
public class pairwise_swap_elements_of_linkedlist {
	
	node head;
	public class node
	{
		int data;
		node next;
		node(int d)
		{
			data = d;
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
	
	public void pair()
	{
		node prev, curr;
		
		prev = head;
		curr = head.next;
		head = curr;
		
		while(true)
		{
			node next = curr.next;
			curr.next = prev;
			
			if(next == null || next.next == null)
			{
				prev.next = next;
				break;
			}
			prev.next = next.next;
			prev = next;
			curr = prev.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pairwise_swap_elements_of_linkedlist l = new pairwise_swap_elements_of_linkedlist();
		
		l.add(6);
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
		
		l.print();
		
		System.out.println(" ");
		
		l.pair();
		
		l.print();

	}

}
