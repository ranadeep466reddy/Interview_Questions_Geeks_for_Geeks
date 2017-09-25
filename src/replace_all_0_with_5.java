
public class replace_all_0_with_5 {
	
	public static int replace(int num)
	{
		int digit;
		int new_number = 0;
		int multiplier = 1;
		while(num != 0)
		{
			digit = num%10;
			num = num/10;
			if(digit == 0)
				digit = 5;
			new_number = (digit * multiplier) + new_number;
			multiplier = multiplier*10;
		}
		return new_number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10120;
		System.out.println(replace(i));
		}
	}

