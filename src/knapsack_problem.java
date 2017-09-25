
public class knapsack_problem {
	
	public static int max(int a, int b)
	{
		return a > b ? a : b;
	}
	
	public static int knapsack(int[] val, int[] wt, int W, int n)
	{
		int i, w;
		int[][] k = new int[n+1][W+1];
		
		for(i = 0; i <= n; i++)
		{
			for(w = 0; w <= W; w++)
			{
				if(i == 0 || w == 0)
					k[i][w] = 0;
				
				else if(wt[i-1] <= w)
					k[i][w] = max(val[i-1]+k[i-1][w - wt[i-1]], k[i-1][w]);
				else
					k[i][w] = k[i-1][w];
			}
		}
		return k[n][W];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int[] val = {60,100,120};
		int[] wt = {10,20,30};
		int W = 50;
		int n = val.length;
		System.out.println(knapsack(val,wt,W,n));
	}

}
