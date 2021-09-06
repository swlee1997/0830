package frist;

import java.util.Scanner;

public class Griding {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력하세요 :");
		score = input.nextInt();
		
		if(score>=90)
		{
			System.out.println("A학점 입니다.");
		}
		else if(score>=80)
		{
			System.out.println("B학점 입니다.");
		}
		else if(score>=70)
		{
			System.out.println("C학점 입니다.");
		}
		else if(score>=60)
		{
			System.out.println("D학점 입니다.");
		}
		else
		{
			System.out.println("F학점 입니다.");
		}
	}
}
