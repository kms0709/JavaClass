package p14;

public class Ex2_Wrapper객체 {

	public static void main(String[] args) {
		// 문자열로 Wrapper 객체 생성
		Integer i = Integer.valueOf("10");
		Double d = Double.valueOf("3.14");
		Boolean b = Boolean.valueOf("false");

		// 변수 출력
		System.out.println(i.getClass());
		System.out.println("i : " + i);
		System.out.println("d : " + d);
		System.out.println("b : " + b);
	}

}
