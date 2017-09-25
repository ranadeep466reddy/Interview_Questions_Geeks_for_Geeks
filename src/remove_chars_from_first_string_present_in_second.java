
public class remove_chars_from_first_string_present_in_second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "geeksforgeeks";
		
		String str2 = "mask";
		
		int[] count = new int[256];
		
		for(int i = 0; i < 256; i++)
			count[i] = 0;
		
		for(int i = 0; i < str2.length(); i++)
			count[str2.charAt(i) - 'a']++;
		
		for(int i = 0; i < str1.length(); i++)
		{
			if(count[str1.charAt(i) - 'a'] == 0)
				System.out.print(str1.charAt(i));
		}

	}

}
