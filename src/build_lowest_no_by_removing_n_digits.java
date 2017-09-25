
public class build_lowest_no_by_removing_n_digits {
	
	public static String removeKdigits(String num, int k) {
	    if(num.length()==k)
	        return "0";
	 
	    StringBuilder sb = new StringBuilder(num);
	    for(int j=0; j<k; j++){
	        int i=0;
	        while(i<sb.length()-1&&sb.charAt(i)<=sb.charAt(i+1)){
	            i++;
	        }
	        sb.delete(i, i+1);
	    }
	 
	    //remove leading 0's        
	  /*  while (sb.length() > 1 && sb.charAt(0)=='0')
	        sb.delete(0,1);
	 
	    if(sb.length()==0){
	        return "0";
	    }*/
	 
	    return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "765028321";
		int k = 5;
		System.out.println(removeKdigits(num, k));

	}

}
