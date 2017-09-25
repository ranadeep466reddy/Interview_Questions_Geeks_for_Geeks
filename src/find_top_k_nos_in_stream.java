import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.*;

class Pair1{
    int num;
    int count;
    public Pair1(int num, int count){
        this.num=num;
        this.count=count;
    }
}

public class find_top_k_nos_in_stream {
	
	public static void top_k_frequency(int[] array, int k)
	{
LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>(); 
		int max = 0;
		for(int i = 0; i < array.length; i++)
		{
			int j = 0;
			int temp = 0;
			
			if(map.containsKey(array[i]))
			{
				temp = map.get(array[i]);
				map.put(array[i], temp+1);
			}
			else
				map.put(array[i], 1);
			
			while(j <= i)
			{
				max = Math.max(max, map.get(array[j]));
			}
		}
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {5,2,1,3,2};
		
		int k = 4;
		
		top_k_frequency(array, k);
	}

}
