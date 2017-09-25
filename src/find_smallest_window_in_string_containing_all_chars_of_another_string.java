import java.util.HashMap;

public class find_smallest_window_in_string_containing_all_chars_of_another_string {
	
	static final int no_of_chars = 256;
	
	public static String findSubString(String str, String pat)
	{
		
		int count = 0;
		int start = 0;
		int start_index = -1;
		int min_len = Integer.MAX_VALUE;
		if(str.length() < pat.length())
			return "";
		
		int hash_str[] = new int[no_of_chars];
		int hash_pat[] = new int[no_of_chars];
		
		for(int i = 0; i < pat.length(); i++)
			hash_pat[pat.charAt(i)]++;
		
		for(int j = 0; j < str.length(); j++)
		{
			hash_str[str.charAt(j)]++;
			
			if(hash_pat[str.charAt(j)] != 0 && hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)])
				count++;
			
			if(count == pat.length())
			{
				while(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] || hash_pat[str.charAt(start)] == 0)
				{
					if(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
					{
						hash_str[str.charAt(start)]--;
						start++;
					}
				}
				int len_window = j - start +1;
				if(min_len > len_window)
				{
					min_len = len_window;
					start_index = start;
				}
			}
		}
	           return str.substring(start_index, start_index+min_len);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       String str = "this is a test string";
	       String sub = "tist";
	       
	       System.out.println(findSubString(str, sub));

	}

}
