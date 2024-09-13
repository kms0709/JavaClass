/*
 두 수? 100 999 
 차: 899
 두 수? 999 100
 차: 899
 ...
 두 수? 3 3(같은 수를 입력시 작업 종료)
 작업을 종료합니다.
*/
package p3;
import java.util.Scanner;
public class Ex9_차 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("두 수?");
			int a = sc.nextInt(); int b = sc.nextInt();
			if(a==b) break;
			int diff = (a>b)? a-b : b-a;
			
			System.out.println("차: "+ diff);
		}//while
		sc.close();
		System.out.println("작업을 종료합니다.");
	}

}
