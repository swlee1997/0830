package frist;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	double area , radius;
	
	System.out.print("���� �������� ���Ͻÿ� :");
	radius = scn.nextDouble();
	
	area = Math.PI * radius * radius;
	
	System.out.print(area);
	}
}
