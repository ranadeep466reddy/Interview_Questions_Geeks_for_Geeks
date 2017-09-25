import java.util.PriorityQueue;

class MyPair implements Comparable<MyPair>
{
	char c;
	int count;
	
	public int compareTo(MyPair o)
	{
		return this.count < o.count ? 1 : -1;
	}
}

public class rearrange_characters_in_string_no_two_adjacent_are_same {
		
		public static void main(String[] args) {
			String inp="aaabc";
			
			int[] ch = new int[26];
			
			for(int i = 0; i < inp.length(); i++)
			{
				ch[inp.charAt(i) - 'a']++;
			}
			
			PriorityQueue<MyPair> queue = new PriorityQueue<MyPair>();
			
			for(int i = 0; i < 26; i++)
			{
				if(ch[i] != 0)
				{
					MyPair pair = new MyPair();
					pair.c = (char)(i + 'a');
					pair.count = ch[i];
					queue.add(pair);
				}
			}
			
			MyPair prev = null;
			StringBuffer sb = new StringBuffer();
			
			while(!queue.isEmpty()){
				
				MyPair temp = prev;
				MyPair curr = queue.poll();
				
				if(curr.count == 0)
					break;
				
				sb.append(curr.c);
				curr.count--;
				
				if(temp != null)
					queue.add(temp);
				
				prev = curr;
			}
			
			if(inp.length() == sb.length())
				System.out.println(sb.toString());
			else
				System.out.println("not possible");
			
	}

}
