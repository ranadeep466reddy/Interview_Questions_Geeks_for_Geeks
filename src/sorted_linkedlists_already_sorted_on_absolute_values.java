
public class sorted_linkedlists_already_sorted_on_absolute_values {
	
	node head;
	class node
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
	
	public void merge()
	{
		node prev, curr;
		prev = head;
		curr = head.next;
		
		while(curr != null)
		{
			if(curr.data < prev.data)
			{
				prev.next = curr.next;
				curr.next = head;
				head = curr;
				curr = prev;
			}
			else
			{
				prev = curr;
				curr = curr.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sorted_linkedlists_already_sorted_on_absolute_values l = new sorted_linkedlists_already_sorted_on_absolute_values();
		
		l.add(-5);
		l.add(4);
		l.add(-3);
		l.add(-2);
		l.add(1);
		
		l.print();
		
		l.merge();
		
		System.out.println(" ");
		
		l.print();

	}

}
