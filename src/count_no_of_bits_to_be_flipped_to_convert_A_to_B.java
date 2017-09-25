
public class count_no_of_bits_to_be_flipped_to_convert_A_to_B {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 146;
		int b = 137;
		int c = a^b;
		int count = 0;
		for(int i = 31; i >= 0; i--)
		{
			if((c & (1<<i)) == 0)
				System.out.print("0");
			else
			{
				count++;
				System.out.print("1");
			}
				
		}
		System.out.println();
		System.out.println(count);

	}

}
