package p3;
//2장 ppt14
public class Ex4문자literal {

	public static void main(String[] args) {
		// char : 2byte
		String line;
		// String line = null; // null은 레퍼런스 변수에만 줄 수 있음.
		char a = 'W';
		char b = '글';
		//String b1 = '글';
		char c = '\uae00'; // '글'의 유니코드 값(ae00) 사용
		char d = '1';
		char e = '0';
		int e1=e;
		// '1' --> 정수 1로 변경
		//'1' --> asciicode 49 '2' --> 50, '0' --> 48
		int num=d-48; //int num=d-'0';
		
		System.out.println(line);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.printf("num : %d\n",num);
		System.out.printf("e : %d\n",e1);
		//'0'의 ascii 48
	}

}
/*
float f = 0.1234F;
double w = .1234D; // .1234D와 .1234는 동일
*/