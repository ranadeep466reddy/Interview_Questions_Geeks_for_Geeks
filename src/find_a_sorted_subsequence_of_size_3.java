
public class find_a_sorted_subsequence_of_size_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,11,10,5,6,2,30,31};
		
		int n = arr.length;
		int max = n-1;
		int min = 0;
		
		int[] smaller = new int[n];
		smaller[min] = -1;
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] <= arr[min])
			{
				min = i;
				smaller[i] = -1;
			}
			else
				smaller[i] = min;
		}
		int[] larger = new int[n];
		larger[max] = -1;
		
		for(int i = n-2; i >= 0; i--)
		{
			if(arr[i] >= arr[max])
			{
				max = i;
				larger[i] = -1;
			}
			else
				larger[i] = max;
		}
		
		for(int i = 0; i < n; i++)
		{
			if(smaller[i] != -1 && larger[i] != -1)
			{
				System.out.println(arr[smaller[i]] + " " + arr[i] + " " + arr[larger[i]]);	
			}
		}
			
	}

}
