 
public class position_of_right_most_set_bit {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 18;
		int j = 0;
		int count = 0;
		int pos = 0;
		for(j = 31; j >= 0; j--)
		{
			if((i & 1<<j) == 0)
				System.out.print("0");
			else
			{
				System.out.print("1");
				pos = j;
			}
				
		}
		System.out.println();
		System.out.println(pos);

	}

}
