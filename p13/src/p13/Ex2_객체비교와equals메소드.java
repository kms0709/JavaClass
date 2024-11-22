package p13;
/*
 * 비고연산자 '==' : 객체 레퍼런스를 비교
 */

public class Ex2_객체비교와equals메소드 {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = a;

		if(a == b) // false
			System.out.println("a==b");
		if(a == c) // true
			System.out.println("a==c");
	}

}
