
public class find_minimum_no_in_sorted_and_rotated_array {
	
	public static int min_element(int[] arr, int low, int high)
	{
	       if(high < low)      //to handle unrotated arrays
	    	   return arr[0];  
	       if(high == low)     //when only one element is left
	    	   return arr[low];
	       int mid = low + (high-low)/2;
	       
	       if(mid < high && arr[mid+1] < arr[mid])
	    	   return arr[mid+1];
	       if(mid > low && arr[mid-1] > arr[mid]) // if mid itself is the smaller element
	    	   return arr[mid];
	       
	       if(arr[high] > arr[mid])
	       return min_element(arr, low, mid-1);
	       else
	    	   return min_element(arr, mid+1, high);	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,6,1,2,3,4};
		System.out.println(min_element(arr,0, arr.length-1));

	}

}
