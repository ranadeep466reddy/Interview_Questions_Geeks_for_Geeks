
public class find_maximum_no_in_sorted_and_rotated_array {
	
	public static int find_max(int[] arr, int low, int high)
	{
		/*int max,mid;
		 mid=(low+high)/2;
		 
		 if(low==high-1 || low==high)
		 {   
		  max=arr[low]>arr[high]?arr[low]:arr[high];
		  return max;
		 }
		  if(arr[mid]>=arr[high])
		 return find_max(arr,mid,high);
		  else if(arr[low]>=arr[mid])
		  return find_max(arr,low,mid);*/
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,6,1,2,3,4};
		System.out.println(find_max(arr, 0, arr.length-1));

	}

}
