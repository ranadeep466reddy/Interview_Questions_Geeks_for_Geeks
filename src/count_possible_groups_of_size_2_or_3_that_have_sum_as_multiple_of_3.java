import java.math.BigInteger;


public class count_possible_groups_of_size_2_or_3_that_have_sum_as_multiple_of_3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,6,7,2,9};
		int n = arr.length;
		int[] c = new int[]{0,0,0};
		int i;
		int res = 0;
		
		for(i = 0; i < n; i++)
			c[arr[i]%3]++;
		
		res += ((c[0] * c[0]-1)>>1);
		
		res += c[1]*c[2];
		
		res += (c[0] * c[0]-1 * c[0]-2)/6;
		res += (c[1] * c[1]-1 * c[1]-2)/6;
		res += (c[2] * c[2]-1 * c[2]-2)/6;
		res += c[0]*c[1]*c[2];
		
		System.out.println(res);

	}

}
