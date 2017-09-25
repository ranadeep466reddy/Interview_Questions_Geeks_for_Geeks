
public class maximise_no_of_zeros_by_flipping_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,0,0,1,1,0};
		
		int zero_count = 0;
		int max_count = 0;
		int max_diff = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 0)
				zero_count++;
			
			int val = (arr[i] == 1) ? 1 : -1;
			
			max_count = Math.max(val, val+max_count);
			max_diff = Math.max(max_count, max_diff);
		}
		max_diff = Math.max(0, max_diff);
           System.out.println(zero_count+max_diff);
	}

}
