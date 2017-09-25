
public class find_a_pair_with_maximum_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {1,4,3,6,7,0};
		
		int[] arr = {-1, -3, -4, 2, 0, -5};
		int f, s;
		
		f = s = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > f)
			{
				s = f;
				f = arr[i];
			}
			
			if(arr[i] > s && arr[i] != f)
			{
				s = arr[i];
			}
		}
		
		System.out.println(f + " " + s);
		
		

	}

}
