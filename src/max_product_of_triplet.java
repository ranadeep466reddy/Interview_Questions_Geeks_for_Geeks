
public class max_product_of_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,-4,3,-6,7,0};
		
		int max1, max2, max3, min1, min2;
		
		max1 = max2 = max3 = Integer.MIN_VALUE;
		min1 = min2 = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max1)
			{
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}
			if(arr[i] > max2)
			{
				max3 = max2;
				max2 = arr[i];
			}
			else if(arr[i] > max3)
			{
				max3 = arr[i];
			}
			
			if(arr[i] < min1)
			{
				min2 = min1;
				min1 = arr[i];
			}
			
			else if(arr[i] < min2)
				min2 = arr[i];
		}
		
		System.out.println(Math.max(min1 * min2 * max1, max1 * max2 * max3));

	}

}
