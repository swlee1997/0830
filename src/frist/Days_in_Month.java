package frist;

import java.util.Scanner;

public class Days_in_Month {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month , days , year;
		System.out.print("년도를 입력하세요 :");
		year = input.nextInt();
		System.out.print("달을 입력하세요 :");
		month = input.nextInt();
		
		switch(month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			days= 30; break;
		case 2:
			if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0)
			{
				days= 29; break;
			}
			else
			{
				days= 28; break;
			}
		default :
			days = 31;break;
		}
		System.out.println(year + "년" + month + "월은" + days + "일까지 있습니다.");
	}
}
