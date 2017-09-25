import java.util.ArrayList;
import java.util.Arrays;

public class for_each_element_in_first_array_count_elements_less_or_equal_in_second_array {
	
	public static int search(int x, int[] arr2, int l, int r)
	{
		int mid = 0;
		while(l <= r)
		{
			mid = (l+r)/2;
			if(arr2[mid] <= x)
				l = mid+1;
			else
				r = mid-1;
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int[] arr1 = {1,2,3,4,7,9};
		int[] arr2 = {0,1,2,1,1,4};
		
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr1.length; i++)
		{
			int res = search(arr1[i], arr2, 0, arr2.length-1);
			list.add(res);
		}
			
		System.out.println(list);

	}

}
