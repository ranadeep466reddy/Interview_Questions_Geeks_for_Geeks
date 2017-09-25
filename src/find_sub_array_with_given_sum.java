import java.util.HashMap;

public class find_sub_array_with_given_sum {
	
	static void subarray(int arr[],int x)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        int rem = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
        	sum += arr[i];
        	
        	if(sum == x)
        	{
        		System.out.println("0" + "---> " + i);
        		break;
        	}
        	rem = sum - x;
        	if(map.containsKey(rem))
        	{
        		System.out.println(map.get(rem)+1 + "---" + i);
        		break;
        	}
        	else
        		map.put(sum, i);
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 4, 20, 3, 10, 5};
		subarray(arr,33);

	}

}
