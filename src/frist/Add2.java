package frist;

import java.util.Scanner;

public class Add2 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("ù ��° �� �Է� :");
		x = input.nextInt();
		System.out.print("�� ��° �� �Է� :");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println(sum);
	}
}
