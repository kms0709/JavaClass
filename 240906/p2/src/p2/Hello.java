package p2;

public class Hello
{
	public static int sum(int m , int n)
	{
		return n+m;
	}
	public static void main(String[] args)
	{
		int i = 20;
		int s;
		char a; //2byte
		s = sum(i,10);//sum() 메소드 호출
		a = '소';
		System.out.println(a); //문자 '소' 화면출력
		System.out.println("Hello"); //"Hello" 문자열 화며 출력
		System.out.println(s); // 정수 s 값 화면 출력
	}

}
