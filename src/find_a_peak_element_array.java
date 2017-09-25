
public class find_a_peak_element_array {
	
	public static int find(int[] array, int low, int high, int n)
	{	
		int mid = low + (high-low)/2;
		
		if((mid == 0 || array[mid-1] <= array[mid]) &&  (mid == n-1 || array[mid+1] <= array[mid]))
			return mid;
		
		else if(mid > 0 && array[mid-1] > array[mid])
			return find(array, low, (mid-1),n);
		
		else return find(array, (mid+1), high,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,20,15,2,23,90,67};
		System.out.println("Index at peak point is:" 
				+ find(array,0,array.length-1,array.length));

	}

}
