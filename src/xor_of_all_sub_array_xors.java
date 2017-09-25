
public class xor_of_all_sub_array_xors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,5,2,4,6};
		int xor = 0;
		int res = 0;
		int n = arr.length;
		/*for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				for(int k = i ; k <= j; k++)
				{
					res ^= arr[k];
				}
				xor ^= res;
				res = 0;
			}
		}*/
		
		for(int i = 0; i < n; i++)
		{
			int freq = (i+1)*(n-i);
			
			if(freq % 2 == 1)
				res = res ^ arr[i];
		}
		
		System.out.println(res);

	}

}
