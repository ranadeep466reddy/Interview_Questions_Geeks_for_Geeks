
public class segregate_even_and_odd_nodes_linkedlist {
	
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
	
	public void seperate()
	{
		node evenstart, evenend, oddstart, oddend;
		node curr = head;
		evenstart = evenend = oddstart = oddend = null;
		
		while(curr != null)
		{
			int element = curr.data;
			
			if(element % 2 == 0)
			{
				if(evenstart == null)
				{
					evenstart = curr;
					evenend = evenstart;
				}
				else
				{
					evenend.next = curr;
				    evenend = curr;	
				}
			}
			else
			{
				if(oddstart == null)
				{
					oddstart = curr;
					oddend = oddstart;
				}
				else
				{
					oddend.next = curr;
					oddend = curr;
				}
			}
			curr = curr.next;
		}
		
		if(evenstart == null || oddstart == null)
			return;
		
		evenend.next = oddstart;
		oddend.next = null;
		head = evenstart;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		segregate_even_and_odd_nodes_linkedlist l = new segregate_even_and_odd_nodes_linkedlist();
		
		l.add(6);
		l.add(7);
		l.add(1);
		l.add(4);
		l.add(5);
		l.add(10);
		l.add(12);
		l.add(8);
		l.add(15);
		l.add(17);
		
		l.print();
		
		l.seperate();
		
		System.out.println();
		
		l.print();

	}

}
