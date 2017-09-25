
public class count_ways_to_reach_nth_stair {

	/*public static int fib(int n)
	{
		if(n <= 1)
			return n;
		return fib(n-1) + fib(n-2);
	}
	public static int count(int n)
	{
		return fib(n+1);
	}*/
	public static int count(int n, int m)
	{
		int[] res = new int[n];
		res[0] = res[1] = 1;
		for(int i = 2; i < n; i++)
		{
			res[i] = 0;
			for(int j = 1; j <= m && j <= i; j++)
				res[i] += res[i-j];
		}
		return res[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int m = 2;
		System.out.println(count(n+1, m));

	}

}
