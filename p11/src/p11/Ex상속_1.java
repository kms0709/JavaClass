package p11;/*
중심점 : [100,999]
반지름 : 5
원의 넓이 : xx.xxxx
*/
public class Ex상속_1 {

	public static void main(String[] args) {
		Circle p = new Circle(100, 999, 5);
		System.out.println("중심점 : ["+p.getX()+", "+p.getY()+"]");
		System.out.println("반지름 : "+p.getRadius());
		System.out.println("원의 넓이 : "+p.getArea());
	}

}
class Point{
	private int x;
	private int y;
	public Point(int x, int y){ this.x=x; this.y=y; }
	
	int getX() { return x; }
	int getY() { return y; }
}
class Circle extends Point{
	private int radius;
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius=radius;
	}
	
	public int getRadius() { return radius; }
	public double getArea() { return radius * radius * Math.PI; }
}