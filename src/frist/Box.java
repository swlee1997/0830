package frist;

import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double w, h , area , p;
		
		System.out.print("�簢���� ���̸� �Է��Ͻÿ� :");
		w = scn.nextDouble();
		System.out.print("�簢���� ���̸� �Է��Ͻÿ� :");
		h = scn.nextDouble();
		
		area = w * h;
		p = 2.0*(w*h);
		
		System.out.println("�簢���� ������"+area);
		System.out.println("�簢���� �ѷ���"+p);
	}
}
