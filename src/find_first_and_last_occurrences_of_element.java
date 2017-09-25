
public class find_first_and_last_occurrences_of_element {
	
	public static int first(int[] arr, int low, int high, int x)
	{
		if(low <= high)
		{
			int mid = low+(high-low)/2;
			if((mid == 0 || arr[mid-1] < x) && arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				return first(arr,low,mid-1,x);
			else
				return first(arr,mid+1, high,x);
		}
		return -1;
	}
	public static int second(int[] arr, int low, int high, int x)
	{
		if(low <= high)
		{
			int mid = low+(high-low)/2;
			if((mid == arr.length-1 || x < arr[mid+1]) && arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				return second(arr,low,mid-1,x);
			else
				return second(arr,mid+1, high,x);
		}
		return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,5,5,5,5,7,123,125};
		int x = 5;
		
		System.out.println("first" + first(arr,0,arr.length-1,x));
		System.out.println("second" +second(arr,0,arr.length-1,x));
	}

}
