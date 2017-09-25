
public class extract_max_numeric_value_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "1000000klh56400000abc365bg";
		StringBuilder sb = new StringBuilder();
		 int min = Integer.MIN_VALUE;
		 int count = 0;
		 
		 for(int i = 0; i < str1.length(); i++)
		 {
			 if(str1.charAt(i) >= '0' && str1.charAt(i) <= '9')
			 {
				 sb.append(str1.charAt(i));
				 int num = Integer.parseInt(sb.toString());
				 if(num > min)
					 min = num;
			 }
			 else
			 //sb.setLength(0);
				 sb.delete(0, sb.length());
		 }
		 System.out.println(min);

	}

}
