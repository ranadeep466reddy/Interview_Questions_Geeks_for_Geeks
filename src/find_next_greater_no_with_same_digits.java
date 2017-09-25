import java.util.Arrays;

public class find_next_greater_no_with_same_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr ={5,3,4,9,7,6};
		int i;
		for(i = arr.length-1; i > 0; i--)
		{
			if(arr[i] > arr[i-1])
				break;
		}
		if(i == 0)
			System.out.println("not possible");
		else
		{
			int pos = 0;
			int num = arr[i-1];
			int max = Integer.MAX_VALUE;
			for(int j = i; j < arr.length; j++)
			{
				if(arr[j] > num && arr[j] < max)
				{
					max = arr[j];
					pos = j;
				}
			}
			int temp = arr[pos];
			arr[pos] = arr[i-1];
			arr[i-1] = temp;
			Arrays.sort(arr, i, arr.length);
			for(i = 0; i < arr.length; i++)
				System.out.print(arr[i]);
		}

	}

}
