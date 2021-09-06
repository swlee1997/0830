package frist;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("정수를 입력하세요 :");
		number = input.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println("입력된 정수는 짝수 입니다.");
		}
		else
		{
			System.out.println("입력된 정수는 홀수 입니다.");
		}
		
		System.out.println("프로그램이 종료 되었습니다.");
	}
}
