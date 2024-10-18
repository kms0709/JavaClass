package p8;
public class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
		//System.out.println("생성자!");
	}
	public int getRadius(){ return radius;  }
	public double getArea(){return radius*radius*Math.PI;}
	public double getCircumference() {return 2*radius*radius*Math.PI; }
}
