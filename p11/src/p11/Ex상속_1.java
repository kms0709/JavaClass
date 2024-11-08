package p11;/*
중심점 : [100,999]
반지름 : 5
원의 넓이 : xx.xxxx
*/
public class Ex상속_1 {

	public static void main(String[] args) {
		Circle p=new Circle(100,999,5);
		System.out.println("중심점 : ["+p.getX()+" ,"+p.getY()+"]");
		System.out.println("반지름 : "+p.getRadius());
		System.out.println("원의 넓이 : "+p.getArea());
	}

}
class Point{
	
}
class Circle extends Point{
	
}