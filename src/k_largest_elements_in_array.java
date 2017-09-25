
public class k_largest_elements_in_array {
	
	static void swap(int arr[],int a,int b)
	{
	    int t=arr[a];arr[a]=arr[b];arr[b]=t;
	}
	static void heapify(int a,int arr[],int n)
	{
	    int left=2*a+1;
	    int right=2*a+2;
	    int min=a;
	    if(left<n)
	    {
	    	if(arr[min]>arr[left]) 
	    		min=left;
	    }
	    if(right<n)
	    {
	    	if(arr[min]>arr[right]) 
	    		min=right;
	    }
	    if(min!=a) 
	    {
	    	swap(arr,a,min);
	        heapify(min,arr,n);
	    }
	}
	static void printArray(int arr[], int n)
	{
		for (int i=0; i<n; ++i)
		System.out.print(arr[i] + " ");
	}

	static void topk(int arr[],int n,int k)
	{
	    int arr1[] = new int[k];
	    int a;
	    for(a=0;a<k;a++)
	    {
	       arr1[a]=arr[a]; 
	    }
	   for(a=k/2 - 1;a>=0;a--)
	   {
		   heapify(a,arr1,k);
	   }
	   for(a=k;a<n;a++)
	   {
	       if(arr1[0]<arr[a]) 
	       {
	            arr1[0]=arr[a];
	            heapify(0,arr1,k);
	       }
	   }
	   printArray(arr1,k);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,2,45,1,32,11,9};
		int n = arr.length;
	    topk(arr,n,3);

	}

}
