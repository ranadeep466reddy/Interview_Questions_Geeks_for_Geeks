
public class max_sum_of_arr_among_all_rotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8,3,1,2};
		int n = arr.length;
		
		int max = 0;
		int in_sum = 0;
		int max_no = 0;
		int total = 0;
		int curr_sum = 0;
		for(int i = 0; i < n ; i++)
		{
			in_sum += arr[i]*i;
			curr_sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			in_sum = in_sum -(curr_sum -(arr.length * arr[i]));
			total = Math.max(in_sum, total);
		}
        System.out.println(total);
	}

}
