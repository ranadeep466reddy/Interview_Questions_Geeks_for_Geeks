
public class add_two_numbers_represented_by_linkedlists {
	
	node head, head1, head2;
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
	public void push(int n)
	{
		node new_node = new node(n);
		new_node.next = head1;
		head1 = new_node;
	}
	public void add1(int n)
	{
		node new_node = new node(n);
		new_node.next = head2;
		head2 = new_node;
	}
	public void print(node n)
	{
		node temp = n;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public int getnum(node n)
	{
		String num = "";
		while(n != null)
		{
			num = num + n.data;
			n = n.next;
		}
		int number = Integer.parseInt(num);
		return number;
	}
	
	public node create_list(int num)
	{
		int digit = 0;
		while(num != 0)
		{
			digit = num%10;
			add1(digit);
			num /= 10;
		}
		return head2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add_two_numbers_represented_by_linkedlists l = new add_two_numbers_represented_by_linkedlists();
		l.add(3);
		l.add(30);
		l.add(99);
		l.print(l.head);
		System.out.println();
		l.push(25);
		l.push(20);
		l.push(15);
		l.print(l.head1);
		System.out.println();
		System.out.println("first: " + l.getnum(l.head));
		System.out.println("Second: " + l.getnum(l.head1));
		
		int result = l.getnum(l.head) + l.getnum(l.head1);
		System.out.println(result);
		
		node list = l.create_list(result);
		l.print(list);
	}

}
