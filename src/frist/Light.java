package frist;

public class Light {
	public static void main(String[] args)
	{
		long lightSpeed , distance;
		
		lightSpeed = 300000;
		distance = lightSpeed * 365L * 24 * 60 * 60;
		
		System.out.print("빛이 1년 동안 가는 거리" + distance);
	}
}
