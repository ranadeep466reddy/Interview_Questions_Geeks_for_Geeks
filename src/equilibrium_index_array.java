
public class equilibrium_index_array {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {-7,1,5,2,-4,3,0};
		int[] arr = {7,-6,-1,7};
		int sum = 0;
		int left_sum = 0;
		
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		
		for(int i = 0; i < arr.length; i++)
		{
			sum -= arr[i];
			
			if(sum == left_sum)
			{
				System.out.println(i);
				break;
			}
			left_sum += arr[i];
		}
		

	}

}
