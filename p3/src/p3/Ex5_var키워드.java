package p3;

public class Ex5_var키워드 {

	public static void main(String[] args) {
		var price = 200; // price는 int 타입으로 결정
		var name = "kitae"; // name은 String 타입으로 결정
		var pi = 3.14; // pi는 dobule 타입으로 결정
		
		/*var ss;
		ss = 'A'; 변수 선언 시 초깃값이 주어지지 않으면 컴파일 오류
		*/
		var ss = 'A';
		
		System.out.println("prce = " + (price + 1000));
		System.out.println("name = " + name);
		System.out.println("pi = " + pi * 10);

	}

}
