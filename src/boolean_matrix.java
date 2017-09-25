
public class boolean_matrix {
	
	public static void make_zeros(int[][] arr)
	{
        boolean rowHasZero = false;
        boolean columnHasZero = false;
		
		for(int i = 0; i < arr[0].length; i++)
		{
                if(arr[0][i] == 1)
                {
                	rowHasZero = true;
                	break;
                }
		}
		
		for(int j = 0; j < arr.length; j++)
		{
			if(arr[j][0] == 1)
			{
				columnHasZero = true;
				break;
			}
		}
		
		for(int i = 1; i < arr.length; i++)
			for(int j = 1; j < arr[0].length; j++)
			{
				if(arr[i][j] == 1)
				{
					arr[i][0] = 1;
					arr[0][j] = 1;
				}
			}
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i][0] == 1)
				nullify_row(arr, i);
		}
		
		for(int j = 1; j < arr[0].length; j++)
		{
			if(arr[0][j] == 1)
			{
				nullify_col(arr, j);
			}
		}
		
		if(rowHasZero)
			nullify_row(arr, 0);
		
		if(columnHasZero)
			nullify_col(arr, 0);
		
	}
	
	public static void nullify_row(int[][] arr, int row)
	{
		for(int i = 0; i < arr[0].length; i++)
			arr[row][i] = 1;
	}
	
	public static void nullify_col(int[][] arr, int col)
	{
		for(int i = 0; i < arr.length; i++)
			arr[i][col] = 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,0,0,1},{0,0,1,0},{0,0,0,0}};
		
		make_zeros(arr);
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();	
		}
}
}
