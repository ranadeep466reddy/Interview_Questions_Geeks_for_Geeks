
public class reverse_bits_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2147483647;
		int sum = 0;
		int num_of_bits = 32;
		int temp;
		int reverse_num = 0;
		for(int i = 0; i < num_of_bits; i--)
		{
			temp = (num & (1 << i));
	        if(temp != 0)
	            reverse_num |= (1 << ((num_of_bits - 1) - i));
		}
		
		System.out.println(reverse_num);

	}

}
