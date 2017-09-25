
public class angle_between_hour_hand_and_minute_hand {
	
	public static int calculate(double h, double m)
	{
		if(h < 0 || h > 12 || m < 0 || m > 60)
			System.out.println("wrong input");
		
		if(h == 12)
			h = 0;
		if(m == 60)
			m = 0;
		int h_angle = (int)((h*60 + m)*0.5);
		int m_angle = (int)(6*m);
		
		int diff = Math.abs((h_angle - m_angle));
		diff = Math.min(360-diff,diff);
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calculate(9,60));

	}

}
