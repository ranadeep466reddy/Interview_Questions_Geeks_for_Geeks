
public class convert_decimal_number_to_roman {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3549;
		
		String m[] = {"","M","MM","MMM"};
		String c[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String x[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String i[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		String th = m[num/1000];
		String h = c[(num%1000)/100];
		String t = x[(num%100)/10];
        String o = i[num%10];
        
        System.out.println(th+h+t+o);
	}

}
