package frist;

import java.util.Scanner;

public class Score2Grade {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int score, number;
		char gr;
		System.out.print("������ �Է��ϼ��� :");
		score = scn.nextInt();
		
		number = score / 10;
		
		switch(number) 
		{
		case 10:
		case 9:
			gr = 'A'; break;
		case 8:
			gr = 'B'; break;
		case 7:
			gr = 'C'; break;
		case 6:
			gr = 'D'; break;
		default :
			gr = 'F'; break;
		}
		System.out.println(score + "��" + gr + "�����Դϴ�.");
	}
}
