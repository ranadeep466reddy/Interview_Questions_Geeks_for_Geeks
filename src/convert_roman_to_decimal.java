
public class convert_roman_to_decimal {
	
	public static int value(char ch)
	{
		if(ch == 'I')
			return 1;
		if(ch == 'V')
			return 5;
		if(ch == 'X')
			return 10;
		if(ch == 'L')
			return 50;
		if(ch == 'C')
			return 100;
		if(ch == 'D')
			return 500;
		if(ch == 'M')
			return 1000;
		return -1;
	}
	
	public static int convert(String str)
	{
		int res = 0;
		for(int i = 0; i < str.length(); i++)
		{
			int s1 = value(str.charAt(i));
			
			if(i+1 < str.length())
			{
				int s2 = value(str.charAt(i+1));
				if(s1 >= s2)
				{
					res += s1;
				}
				else
				{
					res += s2 - s1;
					i++;
				}
			}
			else
			{
				res += s1;
				i++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MCMIV";
		System.out.println(convert(str));

	}

}
