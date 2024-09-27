package p3;
// 2장 ppt23
public class Ex7_타입변환 {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		/*
		System.out.println(b+i);
		// b가 int 타입으로 자동 변환		227
		System.out.println(10/4);
		// (정수 / 정수) = 2(정수)
		System.out.println(10.0/4);
		// 4가 4.0으로 자동 변환		2.5
		*/
		System.out.println(0x12340041);//305397825
		/*2진수 0001 0010 0011 0100 0000 0000 0100 0001
		 * char형이 2byte므로 0000 0000 0100 0001이므로 65
		*/
		System.out.println((char)0x12340041);//A
		System.out.println((byte)(b+i)); 
		//(byte)227 --> -29
		System.out.println((int)2.9 + 1.8); 
		// (2 + 1.8) = 3.8
		System.out.println((int)(2.9 + 1.8));
		// (int)4.7 = 4
		System.out.println((int)2.9 + (int)1.8);
		// (2 + 1) = 3
		
	}

}
