package p12; //함수의 오버라이딩 클래스명과 겹쳐서 AA로 씀
abstract class AA { // 추상 클래스
	abstract public int add(int x, int y); // 추상 메소드
}
abstract class BB extends AA { // 추상 클래스 
	public void show() { System.out.println("B"); }
}
class C extends AA { // 추상 클래스 구현. C는 정상 클래스
	public int add(int x, int y) { return x+y; } // 추상 메소드 구현. 오버라이딩
	public void show() { System.out.println("C"); }
}

public class Ex4_추상클래스의상속 {

	public static void main(String[] args) {
		//A a = new A(); // 컴파일 오류. 추상 클래스의 인스턴스 생성 불가
		//B b = new B(); // 컴파일 오류. 추상 클래스의 인스턴스 생성 불가
		C c = new C(); // 정상
		System.out.println("합 : "+c.add(1000, 999));
	}

}
