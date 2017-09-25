
public class move_all_zeros_to_end_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 0, 0, 0, 3, 6};
		
		int n = arr.length;
		int j = 0;
		for(int i = 0; i < n; i++)
		{
			if(arr[i] != 0)
			{
				arr[j++] = arr[i];
			}
		}
		
		while(j < n)
			arr[j++] = 0;
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

}
