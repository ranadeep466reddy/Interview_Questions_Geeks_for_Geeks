
public class find_element_that_appears_only_once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,1,12,3,12,1,1,2,3,3};
		int result = 0;
		int max = 32;
		for(int i = 0; i < max; i++)
		{
			int sum = 0;
			int x = (1 << i);
			
			for(int j = 0; j < arr.length; j++)
			{
				if((arr[j] & x) == 0)
				{
					sum++;
				}
			}
			if((sum%3) == 0)
				result |= x;
		}
		System.out.println(result);

	}

}
