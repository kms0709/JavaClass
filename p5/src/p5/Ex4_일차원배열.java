package p5;

public class Ex4_일차원배열 {

	public static void main(String[] args) {
		int ia[]=new int[5];//정수형 배열 객체 생성 및 선언
		double []da= {1.2, 2.3, 3.4};
		String st[] = {"사과","바나나","오렌지","딸기"};
		char ch[]; //레퍼런스의 선언
		ch = new char[6];//char형의 배열객체 생성
		ch[3] = '가';
		System.out.println("ia배열요소의 개수 : " +ia.length); //5
		System.out.println("ia배열요소의 개수 : " +da.length); //3
		
		System.out.println("\nia---");
		for(int i =0; i<ia.length ; i++)
		{
			System.out.printf("ia[%d] : %d\n",i,ia[i]);
		}
		
		System.out.println("\nda---");
		for(int i = 0 ; i < da.length; i++)
		{
			System.out.printf("da[%d] : %.1f\n", i,da[i]);
		}
		
		System.out.println("\nst---");
		for(int i = 0 ; i < st.length; i++)
		{
			System.out.printf("st[%d] : %s\n", i,st[i]);
		}
		
		System.out.println("\nch---");
		for(int i = 0 ; i < ch.length; i++)
		{
			System.out.printf("ch[%d] : %c\n", i,ch[i]);
		}
	}

}
