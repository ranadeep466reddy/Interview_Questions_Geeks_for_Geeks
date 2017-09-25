 
public class find_zeros_to_be_flipped_to_have_max_ones {
	
	static void findZeroes(int m, int[] arr)
    {
        int wL = 0, wR = 0;
        int zero_count = 0;
        int bestL = 0;
        int best_window = 0;
        while(wR < arr.length)
        {
        	if(zero_count <= m)
        	{
        		if(arr[wR] == 0)
        			zero_count++;
        		wR++;
        	}
        	if(zero_count > m)
        	{
        		if(arr[wL] == 0)
        			zero_count--;
        		wL++;
        	}
        	
        	if(wR - wL > best_window)
        	{
        		best_window = wR - wL;
        		bestL = wL;
        	}
        }
        
        for(int i = 0; i < best_window; i++)
        {
        	if(arr[bestL+i] == 0)
        	System.out.print((bestL+i) + " ");
        }
    }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 2;
		
		int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		
		findZeroes(m, arr);

	}

}
