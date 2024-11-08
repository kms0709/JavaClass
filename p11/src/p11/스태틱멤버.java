package p11;

class StaticSample
{
	int n;
	void g() {}
	static int m;
	static void f()
	{
		System.out.println("static void f()....");
		System.out.println("m : " + m);
		
	}
}

public class 스태틱멤버 {

	public static void main(String[] args)
	{
		//스태틱멤버 : 객체생성전 사용가능
		StaticSample.m = 3; // 클래스 이름으로 static 필드 접근
		StaticSample.f(); //클래스 이름으로 static 메소드 접근

		StaticSample b1 = new StaticSample();
		b1.m = 3; //객체 이름으로 static 필드 접근
		b1.f(); //객체 이름으로 static 메소드 접근
		
		//non-static은 객체생성하지않으면 접근불가
	}

}
