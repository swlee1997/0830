package frist;

import java.util.Calendar;

public class Welcome {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int currentHour = cal.get(Calendar.HOUR_OF_DAY);
				
				System.out.print("���� �ð���" + currentHour);
				if(currentHour < 12)
				{
					System.out.println("���� ��ħ");
				}
				else if(currentHour < 18)
				{
					System.out.println("���� ����");
				}
				else if(currentHour < 22)
				{
					System.out.println("���� ����");
				}
				else
				{
					System.out.println("����");
				}
				
	}
}
