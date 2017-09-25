
public class atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "123";
		int res = 0;
		int mul = 1;
		int i = 0;
		if(str == null || str.length() < 1)
			return;
		
		char flag = '+';
		if(str.charAt(0) == '-')
		{
			flag = '-';
			i++;
		}
		if(str.charAt(0) == '+')
			i++;

		while(str.length() > i && (str.charAt(i) >= '0' || str.charAt(i) <= '9'))
		{
			res = (res*10) + (str.charAt(i) - '0');
			i++;
		}
		if(flag == '-')
			res = -res;
		if(res > Integer.MAX_VALUE)
			res = Integer.MAX_VALUE;
		else if(res < Integer.MIN_VALUE)
			res = Integer.MIN_VALUE;
		System.out.println(res);
	}

}
