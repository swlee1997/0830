package frist;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TARGETSALES = 1000;
		int mysales;
		int bonus;
		String result;
		
		System.out.print("������ �Է��ϼ��� :");
		mysales = input.nextInt();
		
		if(mysales > TARGETSALES)
		{
			result = "���� �޼�";
			bonus = (mysales - TARGETSALES) / 10;
		}
		else
		{
			result = "���� �̴޼�";
			bonus = 0;
		}
		
		System.out.println(result + "\n" + "���ʽ� :" + bonus);
	}
}
