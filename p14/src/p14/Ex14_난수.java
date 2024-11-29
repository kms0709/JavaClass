package p14;

import java.util.Random;

public class Ex14_난수 {

	public static void main(String[] args) {
		Random r = new Random();
		Random p = new Random();
		for(int x=1; x<=20; x++) {
		int n = r.nextInt(); // 음수, 양수, 0 포함, 자바의 정수 범위 난수 발생
		System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("0에서 99 사이(0과 99 포함)의 정수 난수 발생!!");
		for(int x=1; x<=100; x++) {
		int m = r.nextInt(100);
		// 0<= 정수 난수<100 정수 난수 발생 즉, 0<=정수난수<=99
		//r.nextInt(int bound);
		System.out.print(m+" ");
		}
		System.out.println();
		// 1<=	정수 난수	<=6 주사위 100번 던짐
		System.out.println("주사위");
		for(int x=1; x<=100; x++) {
			int n=p.nextInt(6)+1;//0<= <6,1<= <7
			System.out.print(n+" ");
		}
	}
		
}


