import java.util.Stack;

public class nearest_smaller_no_on_left_side_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prev = 0;
		
		boolean flag;
		int[] arr = {1,3,0,2,5};
		
		Stack<Integer> stack = new Stack<Integer>();  
		
		for(int i = 0; i < arr.length; i++)
		{
			while(!stack.isEmpty() && stack.peek() > arr[i])
				stack.pop();
			
			if(stack.isEmpty())
				System.out.print("--" + " ");
			else
				System.out.print(stack.peek() + " ");
			
			stack.push(arr[i]);
		}
	}

}
