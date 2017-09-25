import java.util.Arrays;

public class pythagorean_triplet_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,1,4,6,5};
		
		for(int i = 0; i < arr.length; i++)
			arr[i] *= arr[i];
		
		Arrays.sort(arr);
		
		for(int i = arr.length-1 ; i >= 2; i--)
		{
			int l = 0;
			int r = i-1;
			
			while(l < r)
			{
			if(arr[l] + arr[r] == arr[i])
			{
				System.out.println("true");
				break;
			}
			
			if(arr[l] + arr[r] > arr[i])
				r--;
			else
				l++;
			}
		}

	}

}
