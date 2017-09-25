
public class print_all_strings_made_by_placing_spaces {

	public static void pattern(String s, int i)
	{
		if(i < s.length())
		{
			pattern(s,i+1);
			//System.out.println(i);
			pattern(s.substring(0,i) + " " + s.substring(i), i+2);
		}
		else
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern("AB",1);
		

	}

}
