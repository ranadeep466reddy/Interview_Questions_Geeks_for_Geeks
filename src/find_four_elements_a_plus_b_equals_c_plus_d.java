import java.util.HashMap;


class pair
{
	int first, second;
	pair(int first, int second)
	{
		this.first = first;
		this.second = second;
	}

public class find_four_elements_a_plus_b_equals_c_plus_d {
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,7,1,2,9,8};
		
		HashMap<Integer, pair> map = new HashMap<Integer, pair>(); 
		
		int sum = 0;
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				sum = arr[i] + arr[j];
				
				if(!map.containsKey(sum))
				{
					map.put(sum, new pair(i, j));
				}
				else
				{
					pair p = map.get(sum);
					System.out.println("pair 1:" + arr[i] + " " + arr[j] + "pair 2:" + arr[p.first] + " " + arr[p.second]);
				}
					
			}
		}

	}

}
