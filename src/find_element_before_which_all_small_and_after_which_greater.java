
public class find_element_before_which_all_small_and_after_which_greater {
	
	public static int find(int[] arr, int n)
	{
		int[] leftMax = new int[n];
		
		leftMax[0] = Integer.MIN_VALUE;
		
		for(int i = 1; i < arr.length; i++)
			leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);
		
		int rightMin = Integer.MAX_VALUE;
		
		for(int i = n-1; i >= 0; i--)
		{
			if(leftMax[i] < arr[i] && rightMin > arr[i])
				return i;
			rightMin = Math.min(rightMin, arr[i]);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		
		int n = arr.length;
		
		System.out.println(find(arr, n));

	}

}
