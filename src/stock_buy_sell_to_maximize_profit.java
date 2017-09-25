import java.util.ArrayList;

class Interval 
{
    int buy, sell;
}

public class stock_buy_sell_to_maximize_profit {
	
	public static void stockBuySell(int price[], int n) 
    {
      ArrayList<Interval> list = new ArrayList<Interval>();
      
      int i = 0;
      int count = 0;
      while(i < n-1)
      {
    	  while(i < n-1 && price[i+1] <= price[i])
        	  i++;
    	  
    	  if(i == n-1)
    		  break;
    	  
    	  Interval e = new Interval();
    	  
    	  if(price[i] <= price[i+1])
    		  e.buy = i++;
    	  
    	  while(i < n && price[i] >= price[i-1])
    		  i++;
    	  
    	      e.sell = i-1;
    	      list.add(e);
    	      count++;
      }
      
      for(i = 0; i < count; i++)
    	  System.out.println("buy on :" + list.get(i).buy + "  sell on :" + list.get(i).sell);
      
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] price = {100,180,260,310,40,535,695};
		
		int n = price.length;
		 
        // fucntion call
        stockBuySell(price, n);
		

 	}

}
