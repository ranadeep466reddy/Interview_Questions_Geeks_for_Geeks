
public class convert_array_to_zig_zag_fashion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,3,7,8,6,2,1};
		//int[] arr = {1,4,3,2};
		for(int i = 0; i < arr.length-1; i++)
		{
			int j = i+1;
			if(arr[i] > arr[j] && i%2 == 0)
			{
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			if(i%2 != 0 && arr[i] < arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
