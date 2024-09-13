package p3;

public class Ex1_정수literal {

	public static void main(String[] args) {
		int n = 15;
		int m = 015; //8진수 1 5
		int k = 0x15; //16진수 1 5
		int b = 0b0101; //2진수 0 1 0 1
		int a = 2147483647;
		long a1 = 2147483648L;
		
		System.out.println("a : "+a);
		System.out.println("a1 : "+a1);
		System.out.println("n : "+n);//15
		System.out.println("m : "+m);//13
		System.out.println("k : "+k);//21
		System.out.println("b : "+b);//5

		//System.out.println("int형의 상한값 : "+Integer.MAX_VALUE);
		//System.out.println("long형의 상한값 : "+Long.MAX_VALUE);
	}

}
