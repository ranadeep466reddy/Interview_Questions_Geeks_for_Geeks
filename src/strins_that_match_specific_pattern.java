import java.util.HashMap;

public class strins_that_match_specific_pattern {
	
	public static String encode(String pattern)
	{
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int k = 0;
		String result = "";
		for(int i = 0; i < pattern.length(); i++)
		{
			char ch = pattern.charAt(i);
			if(!map.containsKey(ch))
				map.put(ch, k++);
			result += map.get(ch);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dic[] = {"abb","abc","xyz","xyy"};
		String pattern = "aba";
		
		String s = encode(pattern);
		System.out.println(s);
		
		for(String i : dic)
		{
			if(encode(i).equals(s))
				System.out.println(i);
		}
	}

}
