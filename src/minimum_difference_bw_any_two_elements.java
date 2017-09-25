import java.util.Arrays;


public class minimum_difference_bw_any_two_elements {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,19,-4,31,38,25,100};
		int diff = Integer.MAX_VALUE;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length-1; i++)
		{
			int temp = arr[i+1]-arr[i];
			if(temp < diff)
			{
				diff = temp;
			}
		}
		System.out.println(diff);

	}

}
