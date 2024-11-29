package p14;

public class Ex4_문자열을_기본데이터타입으로_변환 {

	public static void main(String[] args) {
		//int i = (int)"123"; // error
		
		int i = Integer.parseInt("123");			// i = 123
		//boolean b = Boolean.parseBoolean("true");	// b = true
		//double f = Double.parseDouble("3.14" ); 	// d = 3.14

		System.out.println("i : " + i);
	}

}
