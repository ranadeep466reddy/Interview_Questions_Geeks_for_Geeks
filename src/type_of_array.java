
public class type_of_array {
	
	public static void find(int[] arr)
	{
		boolean increasing = false;
		boolean decreasing = false;
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > arr[i-1])
			{
				increasing = true;
				if(decreasing)
				{
					System.out.println("decreasing rotated : " + arr[i]);
					return;
				}
			}
			else if(arr[i] < arr[i-1])
			{
				decreasing = true;
				if(increasing)
				{
					System.out.println("Increasing rotated : " + arr[i-1]);
					return;
				}
					
			}
				
		}
		if(increasing)
			System.out.println("Only increasing : " + arr[arr.length-1]);
		else
			System.out.println("Only decreasing : " + arr[0]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,6,1,2,3};
		find(arr);
		
		int[] arr1 = {2,1,7,5,4,3};
		find(arr1);
		
		int[] arr2 = {1,2,3,4,5,8};
		find(arr2);
		
		int[] arr3 = {9,5,4,3,2,1};
		find(arr3);

	}

}
