package frist;

import java.util.Scanner;

public class Larger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,max;
		
		System.out.print("ù��° ���� :");
		x = input.nextInt();
		
		System.out.print("�ι�° ���� :");
		y = input.nextInt();
		
		if(x>y)
			max = x;
		else
			max = y;
		
		System.out.println("ū ����" + max);
	}
}
