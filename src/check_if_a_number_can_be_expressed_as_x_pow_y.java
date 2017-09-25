
public class check_if_a_number_can_be_expressed_as_x_pow_y {

	public static boolean is_pow(int num)
	{
		for(int x = 2; x <= Math.sqrt(num); x++)
		{
			int p = x;
			while(p <= num)
			{
				p *= x;
				if(p == num)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i < 100; i++)
			if(is_pow(i))
				System.out.print(i + " ");

	}

}
