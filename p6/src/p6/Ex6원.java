package p6;
/*
 * 반지름 : 5
 * 원의 넓이 : xx.xxxx
 * 원의 둘레 : xx.xxxx
 */

class Circle {
	private int radius;
	
	public Circle(int _radius) {
		radius = _radius;
	}
	
	public int getRadius() { return radius; }
	public float getArea() { return (float)radius * radius * 3.14159f; }
	public float getCircumference() { return (float)radius * 2.0f * 3.14159f; }
}

public class Ex6원 {

	public static void main(String[] args) {
		Circle cir = new Circle(5);
		System.out.printf("반지름 : %d\n", cir.getRadius());
		System.out.printf("원의 넓이 : %.4f\n", cir.getArea());
		System.out.printf("원의 둘레 : %.4f\n", cir.getCircumference());
	}

}
