package frist;

import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double w, h , area , p;
		
		System.out.print("사각형의 넓이를 입력하시오 :");
		w = scn.nextDouble();
		System.out.print("사각형의 높이를 입력하시오 :");
		h = scn.nextDouble();
		
		area = w * h;
		p = 2.0*(w*h);
		
		System.out.println("사각형의 면적은"+area);
		System.out.println("사각형의 둘레은"+p);
	}
}
