
public class check_if_all_bits_of_no_are_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 14;
		
		if((num & (num+1)) == 0)
			System.out.println("yes");
		else
			System.out.println("no");
			

	}

}
