package p12; //5장 ppt26
/*
다운캐스팅(downcasting)
  1) 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
  2) 업캐스팅된 것을 다시 원래대로 되돌리는 것
  3) 반드시 명시적 타입 변환 지정
 */

public class Ex2_다운캐스팅 {
	
	public static void main(String[] args) {
		Person p = new Student("이재문"); // 업캐스팅
		Student s;
		s = (Student)p; // 1) 다운캐스팅

		System.out.println(s.name); // 오류 없음
		s.grade = "A"; // 오류 없음
	}
}
