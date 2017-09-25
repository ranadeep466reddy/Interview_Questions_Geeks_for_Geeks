import java.util.Stack;


public class numbers_having_unique_digits {
 
	public static void funct(int num)
	{
		int[] count = new int[256];
		int digit = 0;
		int prev = Integer.MIN_VALUE;
		int multiplier = 1;
		int new_number = 0;
		while(num != 0)
		{
			digit = num % 10;
			count[digit]++;
			num /= 10;
			new_number += digit*multiplier;
			multiplier *= 10;
		}
		if(count[digit] == 1)
		System.out.print(new_number + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 50; i++)
			funct(i);

	}

}
