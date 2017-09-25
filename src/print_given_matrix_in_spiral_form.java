
public class print_given_matrix_in_spiral_form {
	
	public static void spiral(int[][] a, int m, int n)
	{
		int k = 0, l = 0;
		
		while(k < m && l < n)
		{
			for(int i = l; i < n; i++)
				System.out.print(a[k][i] + " ");
			k++;
			
			for(int i = k; i < m; i++)
				System.out.print(a[i][n-1] + " ");
			n--;
			
			if(k < m)
			{
				for(int i = n-1; i >= l; i--)
					System.out.print(a[m-1][i] + " ");
				m--;
			}
			if(l < n)
			{
				for(int i = m-1; i >= k; i--)
					System.out.print(a[i][l] + " ");
				l++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int R = 3;
		int C = 6;
		int[][] a = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
		
		spiral(a,R,C);

	}

}
