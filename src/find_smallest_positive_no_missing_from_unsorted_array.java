
public class find_smallest_positive_no_missing_from_unsorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 3, -7, 6, 8, 1, -10, 15};
		
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min && arr[i] > 0)
			{
				min = arr[i];
			}
		}
       System.out.println("missing no: " + (min-1));
	}

}
