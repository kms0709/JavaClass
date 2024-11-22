package p12;//5장 ppt35 동적바인딩
class SuperObject {
	protected String name;
	public void paint() {
		draw(); //여기서 자녀 SubObject클래스의 draw()로 동적바인딩
	}
	public void draw() {
		System.out.println("Super Object");
	}
}
public class SubObject extends SuperObject{
	public void draw() {
		System.out.println("Sub Object");
	}
	public static void main(String[] args) {
		SuperObject b = new SubObject();
		b.paint();
	}
}
