package p5;
import java.util.Scanner;
/* 이름? 홍 길 동
 * 국어, 영어?? 95 100
 * ------------------------
 * 이름 : xxx
 * 평균 : xxx.x	평가 : x
 * 	계속하시겠어요(Y/y/N/n)? n
 * 작업을 종료합니다.
 * */
public class Ex2성적 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		String line = "-----------------------------";
		
		// 사용자 입력
		System.out.print("이름? ");
		String name = sc.nextLine(); // 이름
		
		System.out.print("국어, 영어?? ");
		int kor = tc.nextInt(); // 국어
		int eng = tc.nextInt(); // 영어
		
		// 평균 계산
		float ave = (float)(kor + eng) / 2; // 평균 계산
		
		// 평가 계싼
		
		
		// 화면 출력
		System.out.println(line);
		System.out.printf("이름 : %s\n", name);
		System.out.printf("평균 : %5.1f\t평가 : x\n", ave);
		System.out.println("계속하시겠어요(Y/y/N/n)? ");
		
		tc.close();
		sc.close();
	}

}
