import java.util.Iterator;
import java.util.Stack;

public class sort_stack_using_recursion {
	
	public static void reverse(Stack<Integer> stack, int x)
	{
		if(stack.isEmpty() || x > stack.peek())
		{
			stack.push(x);
			return;
		}
		int item = stack.pop();
		reverse(stack, x);
		stack.push(item);
		return;
	}
	
	public static void sort(Stack<Integer> stack)
	{
		if(!stack.isEmpty()){
			int temp = stack.pop();
			sort(stack);
			reverse(stack, temp);
		}
	}
	
	public static void print(Stack<Integer> stack)
	{
		Iterator itr = stack.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(-3);
		stack.push(14);
		stack.push(18);
		stack.push(-5);
		stack.push(30);
		
		print(stack);
		
		sort(stack);
		
		System.out.println();
		print(stack);

	}

}
