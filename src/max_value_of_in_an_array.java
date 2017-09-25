
public class max_value_of_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1,-2,-3,4,10};
		
		int max,min;
		int max_index, min_index;
		max_index = min_index = 0;
		min = max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				max_index = i;
			}
			else if(arr[i] < min)
			{
				min = arr[i];
				min_index = i;
			}
		}
             System.out.println((max - max_index)-(min - min_index));
	}

}
