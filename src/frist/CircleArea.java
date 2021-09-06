package frist;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	double area , radius;
	
	System.out.print("원의 반지름을 구하시오 :");
	radius = scn.nextDouble();
	
	area = Math.PI * radius * radius;
	
	System.out.print(area);
	}
}
