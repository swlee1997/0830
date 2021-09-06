package frist;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TARGETSALES = 1000;
		int mysales;
		int bonus;
		String result;
		
		System.out.print("실적을 입력하세요 :");
		mysales = input.nextInt();
		
		if(mysales > TARGETSALES)
		{
			result = "실적 달성";
			bonus = (mysales - TARGETSALES) / 10;
		}
		else
		{
			result = "실적 미달성";
			bonus = 0;
		}
		
		System.out.println(result + "\n" + "보너스 :" + bonus);
	}
}
