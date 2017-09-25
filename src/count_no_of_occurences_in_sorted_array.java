
public class count_no_of_occurences_in_sorted_array {
	
	public static int first(int[] arr, int l, int r, int x)
	{
		if(r >= l)
		{
			int mid = (l+r)/2;
			
			if((mid == 0 || x > arr[mid-1]) && arr[mid] == x)
				return mid;
			else if(x > arr[mid])
				return first(arr, mid+1, r, x);
			else
				return first(arr, l, mid-1, x);
		}
		return -1;
		
	}
	
	public static int second(int[] arr, int l, int r, int x)
	{
		if(r >= l)
		{
			int mid = (l+r)/2;
			
			if((mid == arr.length-1 || x < arr[mid+1]) && arr[mid] == x)
				return mid;
			else if(x < arr[mid])
				return second(arr, l, mid-1, x);
			else
				return second(arr, mid+1,r, x);
				
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,2,2,2,3};
		int x = 2;
		
		int i = first(arr, 0, arr.length-1, x);
		
		int j = second(arr, i, arr.length-1, x);
		int result = j-i+1;
		System.out.println(result);

	}

}
