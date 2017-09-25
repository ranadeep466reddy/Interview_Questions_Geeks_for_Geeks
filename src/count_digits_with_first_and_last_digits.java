
public class count_digits_with_first_and_last_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 5;
		int n2 = 40;
		int first = 0;
		//int second = 0;
		int count = 0;
		int num;
		int flag;
		int digit = 0;
		for(int i = n1; i < n2; i++)
		{
			num = i;
			flag = 0;
			while(num != 0)
			{
				digit = num%10;
				if(flag == 0)
				{
					first = digit;
					flag = 1;
				}
				num /= 10;
			}
			if(first == digit)
			{
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count+ " ");

	}

}
