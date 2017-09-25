
public class no_of_buildings_facing_sun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,4,8,2,9};
		int count = 1;
		int i = 0, j = 0;
		int max = arr[0];
		for(i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				count++;
				max = arr[i];
			}
			
		}
		System.out.println(count);
	}

}
