import java.util.LinkedList;
import java.util.Queue;


public class generate_binary_numbers_from_1_to_n {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("1");
		while(n-- > 0)
		{
			String s1 = queue.poll();
			System.out.println(s1);
			String s2 = s1;
			queue.add(s1+"0");
			queue.add(s2+"1");
		}
		

	}

}
