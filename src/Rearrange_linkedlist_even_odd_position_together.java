
public class Rearrange_linkedlist_even_odd_position_together {
	
	node head;
	public class node
	{
		node next;
		int data;
		node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void add(int data)
	{
		node new_node = new node(data);
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
	
	public void position()
	{
		node odd, even, evenfirst;
		odd = head;
		even = head.next;
		evenfirst = even;
		
		while(odd != null && even != null && even.next != null)
		{
			odd.next = even.next;
			odd = even.next;
			
			even.next = odd.next;
			even = odd.next;
		}
		odd.next = evenfirst;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rearrange_linkedlist_even_odd_position_together l = new Rearrange_linkedlist_even_odd_position_together();
		
		l.add(70);
		l.add(56);
		l.add(43);
		l.add(30);
		l.add(22);
		l.add(10);
		
		l.print();
		
		l.position();
		
		System.out.println();
		
		l.print();

	}

}
