package frist;

import java.util.Calendar;

public class Welcome {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int currentHour = cal.get(Calendar.HOUR_OF_DAY);
				
				System.out.print("현재 시간은" + currentHour);
				if(currentHour < 12)
				{
					System.out.println("좋은 아침");
				}
				else if(currentHour < 18)
				{
					System.out.println("좋은 점심");
				}
				else if(currentHour < 22)
				{
					System.out.println("좋은 저녘");
				}
				else
				{
					System.out.println("잘자");
				}
				
	}
}
