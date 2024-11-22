package p13;

public class ObjectPropertyEx
{

	public static void main(String [] args)
	{
		Point p = new Point(2,3);
		Point q = new Point(2,3);
		System.out.println(p.getClass()); 			//class p13.Point
		System.out.println(p.getClass().getName()); // 클래스 이름
		System.out.println(p.hashCode()); 			// 해시 코드 값
		System.out.println(p.toString()); 			// 객체의 문자열
		
		System.out.println("------------------");
		
		System.out.println(q.getClass()); 			//class p13.Point
		System.out.println(q.getClass().getName()); // 클래스 이름
		System.out.println(q.hashCode()); 			// 해시 코드 값
		System.out.println(q.toString()); 			// 객체의 문자열
	}

}
