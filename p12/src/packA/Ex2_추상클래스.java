package packA;

abstract class DObject {
	public abstract void draw();
}

class Line extends DObject {
	@Override
	public void draw() {
		 System.out.println("Line");
	}
}

class Rect extends DObject {
	@Override
	public void draw() {
		 System.out.println("Rect");
	}
}

class Circle extends DObject {
	@Override
	public void draw() {
		 System.out.println("Circle");
	}
}

public class Ex2_추상클래스 {

	public static void main(String[] args) {
		Line p=new Line();
		p.draw(); //Line
		Rect q=new Rect();
		q.draw(); //Rect
		Circle r=new Circle();
		r.draw(); //Circle
		DObject s=p; //업캐스팅
		s.draw();

	}

}
