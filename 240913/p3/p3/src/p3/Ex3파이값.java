package p3;
import java.util.Scanner;
public class Ex3파이값 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line="------------------";
		while(true) {
		System.out.print("반지름? ");
		int r=sc.nextInt();
		if(r<1) break;
		double area=r*r*Math.PI;
		//PI=3.14; //ERROR final상수 PI는 변경불가
		double dul=2*r*Math.PI;
		System.out.println(line);
		
		System.out.printf("반지름 :%d\n",r);
		System.out.printf("원의 넓이:%.4f\n",area);
		System.out.printf("원의 둘레:%.4f\n\n",dul);
		}
		sc.close();
		System.out.println("종료합니다.");
	}
}
//System.out.println("Math.PI"+Math.PI);
//Math.PI : 3.141592653589793