package p8;
/*반지름 : 1 넓이 : x.xxxx 둘레 : x.xxxx
 ... 
 */

public class Ex1_객체배열 {

	public static void main(String[] args) {
		Circle c[]=new Circle[5];//객체배열의 생성 및 선언
		System.out.println("c.length : "+c.length);//5
		//System.out.println("Math.pi : "+Math.PI);
		for(int i=0;i<c.length;i++) {
			c[i]=new Circle(i+1);//Circle 객체 생성
		}
		for(int i=0;i<c.length;i++) {
		//System.out.println("반지름 : "+c[i].getRadius()+"\t넓이 :"+c[i].getArea()+"둘레 : ");
		System.out.printf("반지름 : %d\t넓이 : %7.4f\t둘레 : %f\n",c[i].getRadius(),c[i].getArea(),c[i].getCircumference());		}
	}

}
