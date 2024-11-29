package p14;

public class Ex4_문자열을_기본데이터타입으로_변환 {

	public static void main(String[] args) {
		//int i = (int)"123"; // error	
		//int i = Integer.parseInt("123");			// i = 123
		//boolean b = Boolean.parseBoolean("true");	// b = true
		//double f = Double.parseDouble("3.14" ); 	// d = 3.14

		//---기본 타입을 문자열로 변환
		String s1 = Integer.toString(123); 	
		// 정수 123을 문자열 "123" 으로 변환
		String s2 = Integer.toHexString(123); 
		System.out.println("s2 : " + s2); //"7b"
		// 정수 123을 16진수의 문자열 "7b"로 변환
		String s3 = Double.toString(3.14); 	
		// 실수 3.14를 문자열 "3.14"로 변환
		String s4 = Character.toString('a');
		// 문자 ‘a’를 문자열 "a"로 변환
		String s5 = Boolean.toString(true); 	
		// 불린 값 true를 문자열 "true"로 변환
		String s6 = Integer.toOctalString(123); 
		System.out.println("s6 : " + s6); //8진수 "173"
		String s7 = Integer.toBinaryString(123);
		System.out.println("s7 : " + s7); //2진수 "1111011"
		int n=Integer.bitCount(123);
		System.out.println("n : " + n); //6
		
	}

}
