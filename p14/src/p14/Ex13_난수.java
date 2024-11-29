package p14;/*
Math.random() 메소드로 난수 발생
0.0<Math.random()<1.0 : 실수 난수 발생

*/

public class Ex13_난수 {

	public static void main(String[] args) {
		for(int x=1; x<=20; x++) {
		//System.out.println(Math.random());
		System.out.println(Math.random()*100);
		}
		System.out.println("1<=난수<=100--");
		for(int x=0; x<10; x++) {
			int n = (int)(Math.random()*100 + 1); // 1~100까지의 랜덤 정수 발생
			System.out.println(n);
		}


	}

}
