
public class count_no_of_ways_to_cover_a_distance {
	
	public static int fib(int n)
	{
		if(n < 0)
			return 0;
		if(n == 0)
			return 1;
		return fib(n-1) + fib(n-2)+fib(n-3);
	}
	public static int ways(int n)
	{
		int count[] = new int[n+1];
		count[0] = 1;
		count[1] = 1;
		count[2] = 2;
		
		for(int i = 3; i <= n; i++)
		{
			count[i]  = count[i-1] + count[i-2] + count[i-3];
		}
		return count[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		System.out.println(fib(n));
		System.out.println(ways(n));

	}

}
