package p14;

public class Ex12_Math클래스활용 {

	public static void main(String[] args) {
		System.out.println(Math.abs(-30)); // 절댓값 구하기
		System.out.println(Math.sqrt(9.0)); // 9의 제곱근 = 3
		System.out.println(Math.exp(2)); // e의 제곱 7.38905609893065
		System.out.println(Math.round(3.14)); // 3 반올림
		System.out.println(Math.round(3.64)); // 4
		System.out.println(Math.round(-3.14)); // -3
		System.out.println(Math.round(-3.64)); // -4
		System.out.println(Math.max(111, 999)); // 999
		System.out.println(Math.min(111, 999));// 111
		//[1, 45] 사이의 정수형 난수 5개 발생
		System.out.print("이번주 행운의 번호는 ");
		for (int i=0; i<5; i++){
			System.out.print((int)(Math.random()*(45-1 + 1) +1) + " "); // 난수 발생
		}	

	}

}
