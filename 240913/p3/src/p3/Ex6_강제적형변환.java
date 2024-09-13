package p3;
// 2장 ppt22
public class Ex6_강제적형변환 {

	public static void main(String[] args) {
		int n = 300;
		//byte b = n; // int 타입이 byte로 자동변환 안됨
		byte b = (byte)n;
		System.out.println("b: " + b); // 44
		
		double d = 1.9;
		//int m = d; // c, c++ 에서는 m에 1저장, 자바는 에러
		int m = (int)d; // n = 1;
		System.out.println("m: " + m);
		
		
		/*
		System.out.println(Byte.MAX_VALUE); // 127
		System.out.println(Byte.MIN_VALUE); // -128
		*/
	}

}
