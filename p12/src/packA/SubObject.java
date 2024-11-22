package packA; //5장 ppt 36 super
/*
1) 슈퍼 클래스의 멤버를 접근할 때 사용되는 레퍼런스
     super.슈퍼클래스의멤버
2) 서브 클래스에서만 사용
3) 슈퍼 클래스의 필드 접근
4) 슈퍼 클래스의 메소드 호출 시
5) super로 이루어지는 메소드 호출 : 정적 바인딩
 */
class SuperObject {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class SubObject extends SuperObject{
	protected String name;
	public void draw() {
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		SuperObject b = new SubObject(); //업캐스팅
		b.paint();
	}

}
