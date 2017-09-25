
public class maximum_sum_path_in_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2,3,7,10,12,15,30,34};
		
		int[] arr2 = {1, 5, 7, 8, 10, 15, 16, 19};
		
		int i = 0, j = 0;
		int m = arr1.length;
		int n = arr2.length;
		int result = 0;
		int sum1 = 0, sum2 = 0;
		
		while(i < m && j < n)
		{
			if(arr1[i] < arr2[j])
			{
				sum1 += arr1[i++];
			}
			
			else if(arr2[j] < arr1[i])
			{
				sum2 += arr2[j++];
			}
			else
			{
				result += Math.max(sum1, sum2);
				
				sum1 = 0;
				sum2 = 0;
				
				while(i < m && j < n && arr1[i] == arr2[j])
				{
					result += arr1[i++];
					j++;
				}
			}
			
		}
		
		while(i < m)
			sum1 += arr1[i++];
		
		while(j < n)
			sum2 += arr2[j++];
		
		result += Math.max(sum1, sum2);
        
		System.out.println(result + " ");
	}

}
