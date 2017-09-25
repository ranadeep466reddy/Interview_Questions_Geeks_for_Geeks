/** The worst case occurs when all elements are sorted in decreasing order. 
 * If elements are sorted in decreasing order, then every element is processed at most 4 times.**/
import java.util.Stack;

public class next_greater_element {
	
	public static void next(int[] arr)
	{
		int n = arr.length;
		int next, element = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(arr[0]);
		
		for(int i = 1; i < arr.length; i++)
		{
			next = arr[i];
			if(!stack.isEmpty()){
				element = stack.pop();
				
				while(element < next)
				{
					System.out.println(element + "------ " + next);
					if(stack.isEmpty())
						break;
					element = stack.pop();
				}
				
				if(element > next)
				{
					stack.push(element);
				}
			}
			stack.push(next);
		}
		
		while(!stack.isEmpty())
		{
			element = stack.pop();
			System.out.println(element + "---- -1");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {11, 13, 21, 3};
		
		next(arr);

	}

}
