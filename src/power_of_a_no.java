
public class power_of_a_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2;
		int pow = 5;
		
		int result = 1;
		while(pow != 0)
		{
			if((pow & 1) == 1)
			{
				result *= num;
			}
			//pow >>= 1;
			pow /= 2;
			num *= num;
		}
		
		System.out.println(result);

	}

}
