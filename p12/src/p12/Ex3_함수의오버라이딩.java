package p12;/*
메소드 오버라이딩(Method Overriding)
서브 클래스에서 슈퍼 클래스의 메소드 중복 작성
슈퍼 클래스의 메소드 무력화, 항상 서브 클래스에 오버라이딩한 메소드가 실행되도록 보장됨
“메소드 무시하기”로 번역되기도 함
오버라이딩 조건
슈퍼 클래스 메소드의 원형(메소드 이름, 인자 타입 및 개수, 리턴 타입) 동일하게 작성
*/

public class Ex3_함수의오버라이딩 {

	public static void main(String[] args) {
		B b=new B();
		b.f(); //B.... f()
		A a=new B(); //업캐스팅
		a.f(); //B.... f() 동적바인딩


	}

}
class A{
	void f() {
		System.out.println("A.... f()");
	}
	
}
class B extends A{
	void f() {
		System.out.println("B.... f()");
	}
}