
public class length_of_longest_substring_without_repeating_chars {
	
	static final int NO_OF_CHARS = 256;
    
    static int longestUniqueSubsttr(String str)
    {
    	int n = str.length();
    	int cur_len = 1;
    	int max_len = 1;
    	int prev_index;
    	
    	int[] visited = new int[NO_OF_CHARS];
    	
    	for(int i = 0; i < 255; i++)
    		visited[i] = -1;
    	
    	visited[str.charAt(0)] = 0;
    	
    	for(int i = 1; i < n; i++)
    	{
    		prev_index = visited[str.charAt(i)];
    		
    		if(prev_index == -1 || prev_index < i - cur_len)
    			cur_len++;
    		
    		else
    		{
    			if(cur_len > max_len)
    				max_len = cur_len;
    			
    			cur_len = i - prev_index;
    		}
    		visited[str.charAt(i)] = i;
    	}
    	if(cur_len > max_len)
			max_len = cur_len;
    	return max_len;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABDEFGABEF";
        System.out.println("The input string is "+str);
        int len = longestUniqueSubsttr(str);
        System.out.println("The length of "
                + "the longest non repeating character is "+len);

	}

}
