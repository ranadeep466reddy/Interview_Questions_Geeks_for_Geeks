
public class palindrome_partitioning {
	
	public static int minCut(String str){
        if(str.length() == 0)
        	return 0;
        int[] cut = new int[str.length()];
        boolean[][] isPal = new boolean[str.length()][str.length()];
        int min;
        for(int i = 1; i < str.length(); i++)
        {
        	min = i;
        	for(int j = 0; j <= i; j++)
        	{
        		if(str.charAt(i) == str.charAt(j) && (i <= j+1 || isPal[i-1][j+1]))
        		{
        			isPal[i][j] = true;
        			min = Math.min(min, j == 0 ? 0 : 1 + cut[j-1]);
        		}
        	}
        	cut[i] = min;
        }
        return cut[str.length()-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ababbbabbababa";
		System.out.println(minCut(str));

	}

}
