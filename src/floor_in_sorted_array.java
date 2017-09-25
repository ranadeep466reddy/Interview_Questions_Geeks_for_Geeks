
public class floor_in_sorted_array {
	
	public static int floor(int[] arr, int low, int high, int x)
	{
		if (low > high)
	        return -1;
	 
	    // If last element is smaller than x
	    if (x >= arr[high])
	        return high;
	 
	    // Find the middle point
	    int mid = (low+high)/2;
	 
	    // If middle point is floor.
	    if (arr[mid] == x)
	        return mid;
	 
	    // If x lies between mid-1 and mid
	    if (mid > 0 && arr[mid-1] <= x && x < arr[mid])
	        return mid-1;
	 
	    // If x is smaller than mid, floor must be in
	    // left half.
	    if (x < arr[mid])
	        return floor(arr, low, mid-1, x);
	 
	    // If mid-1 is not floor and x is greater than
	    // arr[mid],
	    return floor(arr, mid+1, high, x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,8,10,10,12,19};
		int x = 5;
		System.out.println(floor(arr, 0, arr.length-1,x));

	}

}
