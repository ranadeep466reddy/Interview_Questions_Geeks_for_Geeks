
public class find_the_nth_magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int pow = 1;
		int sum = 0;
		
		while(n > 0)
		{
			pow *= 5;
			
			if((n & 1) != 0)
				sum += pow;
			
			n >>= 1;
				
		}
		System.out.println(sum);
	}

}
