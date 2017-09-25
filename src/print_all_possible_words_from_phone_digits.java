
public class print_all_possible_words_from_phone_digits {
	
	public static final String[] hashTable = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void main(String[] args)
	{
		int[] num = {2,3,4};
		print_words(num,num.length);
	}
	public static void print_util(int[] num, int curr_digit, char[] output, int n)
	{
		int i = 0;
		if(curr_digit == n)
		{
			System.out.print(output);
	        return;
		}
		while(curr_digit < n)
		{
			while(i < hashTable[num[curr_digit]].length())
			{
				if(num[curr_digit] == 0 || num[curr_digit] == 1)
				{
					curr_digit++;
					continue;
				}
				output[curr_digit] = hashTable[num[curr_digit]].charAt(i);
				print_util(num, curr_digit+1, output, n);
				i++;
			}
			curr_digit++;
		}
	}
	public static void print_words(int[] num , int n)
	{
		char[] result = new char[n+1];
		//result[n] = '\0';
		print_util(num, 0, result, n);
	}
	}

