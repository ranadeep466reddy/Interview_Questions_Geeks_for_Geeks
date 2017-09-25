
public class search_an_element_in_sorted_rotated_array {
	
	public static int search(int[] arr, int l, int r, int k)
	{
		if(l > r)
			return -1;
		
		int mid = (l+r)/2;
		
		if(arr[mid] == k)
			return mid;
		
		if(arr[l] <= arr[mid])
		{
			if(k >= arr[l] && k <= arr[mid])
				return search(arr, l, mid-1, k);
	
				return search(arr, mid+1,r,k);
		}
			if(k >= arr[mid] && k <= arr[r])
				return search(arr, mid+1, r, k);
			else
				return search(arr, mid-1, l, k);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,6,7,8,9,1,2,3};
		int key = 6;
		int res = search(arr,0,arr.length-1,key);
        if(res != -1)
        	System.out.println(res);
        else
        	System.out.println("key not found");
	}

}
