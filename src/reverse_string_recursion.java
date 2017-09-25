
public class reverse_string_recursion {
	
	public static String reverse_string(String str)
	{
		if(str == null || str.length() <= 1)
			//return Character.toString(str.charAt(0));
			return str;
		else
		{
			//System.out.print(str.charAt(str.length()-1));
			return Character.toString(str.charAt(str.length()-1)) + reverse_string(str.substring(0, str.length()-1));	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd";
        StringBuilder sb = new StringBuilder(); 		
		System.out.println(reverse_string(str));

	}

}
