package frist;

import java.util.Scanner;

public class Griding {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		
		System.out.print("������ �Է��ϼ��� :");
		score = input.nextInt();
		
		if(score>=90)
		{
			System.out.println("A���� �Դϴ�.");
		}
		else if(score>=80)
		{
			System.out.println("B���� �Դϴ�.");
		}
		else if(score>=70)
		{
			System.out.println("C���� �Դϴ�.");
		}
		else if(score>=60)
		{
			System.out.println("D���� �Դϴ�.");
		}
		else
		{
			System.out.println("F���� �Դϴ�.");
		}
	}
}
