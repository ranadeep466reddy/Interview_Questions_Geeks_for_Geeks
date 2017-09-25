
public class two_non_repeating_elements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,3,4,4};
		int xor = 0;
		int x = 0;
		int y = 0;
		for(int i = 0; i < arr.length; i++)
			xor ^= arr[i];
		
		int set_bit = xor & ~(xor-1);
		
		for(int i = 0; i < arr.length; i++)
		{
			if((arr[i] & set_bit) == 1)
				x ^= arr[i];
			else
				y ^= arr[i];
		}
        System.out.println(x + " " + y);
	}

}
