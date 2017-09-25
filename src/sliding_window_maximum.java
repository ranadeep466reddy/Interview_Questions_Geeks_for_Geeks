import java.util.ArrayDeque;
import java.util.Deque;

public class sliding_window_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,1,4,5,2,3,6};
		int k = 3;
		int n = a.length;
		int[] r = new int[n-k+1];
		int l = 0;
		Deque<Integer> q = new ArrayDeque<>();
		
		for(int i = 0; i < a.length; i++)
		{
			while(!q.isEmpty() && q.peek() < i-k+1)
				q.poll();
			
			while(!q.isEmpty() && a[q.peekLast()] < a[i])
				q.pollLast();
			
			q.offer(i);
			
			if(i >= k -1)
				r[l++] = a[q.peekFirst()];
		}
		
		for(int i = 0; i < r.length; i++)
			System.out.print(r[i] + " ");
	}
}

