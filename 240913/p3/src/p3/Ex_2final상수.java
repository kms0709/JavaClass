/*반지름을 입력하여 변수에 할당후, 원의 넓이와 둘레를 구하라
반지름? 5
--------------------------
반지름 : x
원의 넓이 : xx.xxxx
원의 둘레 : xx.xxxx
*/
package p3;
import java.util.Scanner;
public class Ex_2final상수 {
	//static double PI=3.1415927;//전역변수
	static final double PI=3.1415927;//final상수 PI
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line="------------------";
		while(true) {
		System.out.print("반지름? ");
		int r=sc.nextInt();
		if(r<1) break;
		double area=r*r*PI;
		//PI=3.14; //ERROR final상수 PI는 변경불가
		double dul=2*r*PI;
		System.out.println(line);
		System.out.printf("반지름 :%d\n",r);
		System.out.printf("원의 넓이:%.4f\n",area);
		System.out.printf("원의 둘레:%.4f\n\n",dul);
		}
		sc.close();
		System.out.println("종료합니다.");
	}
}
