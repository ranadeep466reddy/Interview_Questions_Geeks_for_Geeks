
public class square_root_of_an_integer {
	
	public static int square(int x)
	{
		int start, end, ans;
		start = 0;
		ans = 0;
		end = x/2;
		
		while(start <= end)
		{
			int mid = (start+end)/2;
			
			if(mid * mid == x)
				return mid;
			if(mid * mid < x)
			{
				start = mid+1;
				ans = mid;
			}
			else
				end = mid-1;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 11;
		System.out.println(square(x));

	}

}
