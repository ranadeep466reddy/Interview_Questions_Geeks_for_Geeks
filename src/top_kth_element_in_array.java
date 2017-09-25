
public class top_kth_element_in_array {
	
	public static int findKthLargest(int[] nums, int k)
	{
		if(nums.length == 0 || k < 1)
			return 0;
		
		return getKth(nums.length-k+1, nums, 0, nums.length-1);
			
	}
	
	public static int getKth(int k, int[] nums, int start, int end)
	{
		int pivot = nums[end];
		int left = start;
		int right = end;
		
		while(true)
		{
			while(nums[left] < pivot && left < right)
				left++;
			while(nums[right] >= pivot && left < right)
				right--;
			
			if(left == right)
				break;
			swap(nums, left, right);
		}
		
		swap(nums, left, end);
		
		if(k == left + 1)
			return pivot;
		else if(k < left + 1)
			return getKth(k, nums, start, left-1);
		else
			return getKth(k, nums, left+1 , end);
	}
	
	public static void swap(int[] nums, int left, int right)
	{
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,7,8,9,1,5};
		int k = 3;
		
		System.out.println(findKthLargest(arr, k));
		

	}

}
