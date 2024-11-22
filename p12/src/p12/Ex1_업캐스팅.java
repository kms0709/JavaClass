package p12;
/*
 업캐스팅(upcasting)
   1) 서브 클래스의 레퍼런스를 슈퍼 클래스 레퍼런스에 대입
   2) 슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가리키게 되는 현상
 */
public class Ex1_업캐스팅 {
	public static void main(String[] args) {
		Person  p;
		Student s = new Student("이재문");
		p = s; // 1) 업캐스팅 발생		
		System.out.println(p.name); // 오류 없음
		//p.grade = "A"; // 컴파일 오류
		//p.department = "Com"; // 컴파일 오류
	}

}
