
public class find_index_of_extra_element_present_in_one_sorted_array {
	
	public static int find(int[] arr1, int[] arr2, int n)
	{
		int index = -1; // Initialize result

		// left and right are end points denoting
		// the current range.
		int left = 0, right = n - 1;
		while (left <= right)
		{
			int mid = (left+right) / 2;

			// If middle element is same of both
			// arrays, it means that extra element
			// is after mid so we update left to mid+1
			if (arr2[mid] == arr1[mid])
				left = mid + 1;

			// If middle element is different of the
			// arrays, it means that the index we are
			// searching for is either mid, or before
			// mid. Hence we update right to mid-1.
			else
			{
				index = mid;
				right = mid - 1;
			}
		}

		if(index==-1)
		   return n;
		else
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2,4,6,8,10,12,13};
		int[] arr2 = {2,4,6,8,10,12};
	    int n = arr2.length;
	    
	    System.out.println("Index is: " + find(arr1, arr2, n));

	}

}
