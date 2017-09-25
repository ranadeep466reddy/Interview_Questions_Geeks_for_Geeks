import java.util.Arrays;


public class count_no_of_possible_triangles {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,21,22,100,101,200, 300};
		int count = 0;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length-2;i++)
		{
			int k = i+2;
			for(int j = i+1; j < arr.length; j++)
			{
				while(k < arr.length && arr[i]+arr[j] > arr[k])
					k++;
				count += k-j-1;
			}
		}
		System.out.println(count);

	}

}
