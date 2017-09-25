//Divide and conquer O(log(min(m,n)))

public class median_of_two_sorted_arrays {
	
	public static double findMedianSortedArrays(int[] A, int[] B) {
		
		int m = A.length;
		int n = B.length;
		
		if (m > n) { // to ensure m<=n
            int[] temp = A; 
            A = B; 
            B = temp;
            int tmp = m; 
            m = n; 
            n = tmp;
        }
		
		int halflen = (m+n+1)/2;
		int iMin = 0;
		int iMax = m;
		
		while(iMin <= iMax)
		{
			int i = (iMin+iMax)/2;
			int j = halflen-i;
			
			if(i < iMax && B[j-1] > A[i])
				iMin = iMin + 1;
			
			else if(i > iMin && A[i-1] > B[j])
				iMax = iMax - 1;
			
			else
			{
				double maxleft = 0;
				if(i == 0)
					maxleft = B[j-1];
				else if(j == 0)
					maxleft = A[i-1];
				else
					maxleft = Math.max(A[i-1], B[j-1]);
				
				if((m+n) % 2 == 1)
				return maxleft;
				
				double minRight = 0;
				if(i == m)
					minRight = B[j];
				else if(j == n)
					minRight = A[i];
				else
					minRight = Math.min(A[i], B[j]);
				
				return (maxleft+minRight)/2;
			}
			}
		           return 0.0;
        	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
			System.out.println(findMedianSortedArrays(arr1, arr2));

  	}

}
