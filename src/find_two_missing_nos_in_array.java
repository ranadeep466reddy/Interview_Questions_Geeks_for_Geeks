
public class find_two_missing_nos_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4};
		
		int x1 = arr[0], x2 = 0;
		
		for(int i = 1;i < arr.length-2; i++)
			x1 ^= arr[i];
		
		for(int i = 1; i <= arr.length; i++)
			x2 ^= i;
		
		int xor = (x1 ^ x2);
		
		int set_bit = xor & ~(xor-1);
		int x = 0, y = 0;
		
		for(int i = 0; i < arr.length-2; i++)
		{
			if((set_bit & arr[i]) == 0)
				x ^= arr[i];
			else
				y ^= arr[i];
		}
		
		for(int i = 1; i <= arr.length; i++)
		{
			if((set_bit & i) == 0)
				x ^= i;
			else
				y ^= i;
		}
		
		System.out.println(x + " " + y);

	}

}
