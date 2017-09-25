
public class sort_a_linkedlist_of_zeros_ones_twos {
	
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
	
	public void sort()
	{
		node temp = head;
		int[] count = new int[3];
		
		while(temp != null)
		{
			count[temp.data]++;
			temp = temp.next;
		}
		
		int i = 0;
		temp = head;
		
		while(temp != null)
		{
			if(count[i] == 0)
				i++;
			else
			{
				temp.data = i;
				--count[i];
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sort_a_linkedlist_of_zeros_ones_twos l = new sort_a_linkedlist_of_zeros_ones_twos();
		
		l.add(0);
		l.add(1);
		l.add(0);
		l.add(2);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(1);
		l.add(2);
		
		l.print();
		
		l.sort();
		
		System.out.println();
		
		l.print();

	}

}
