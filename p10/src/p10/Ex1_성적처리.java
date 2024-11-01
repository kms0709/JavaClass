package p10;
import java.util.Scanner;

public class Ex1_성적처리 {
	static void menu() {
		System.out.println("-- 메뉴 --");
		System.out.println("1. 기본data 입력");
		System.out.println("2. 기본data 출력");
		System.out.println("3. 성적표 출력");
		System.out.println("4. 번호로 조회");
		System.out.println("5. 성적표 출력(등수순)");
		System.out.println("6. 작업종료");
	}
	
	static void baseInput() {
		System.out.println("#기본data 입력 작업입니다.");
		// 번호? 11
		// 이름? 홍 길 동
		// 국어, 영어? 95 100
		System.out.println("#기본data 입력 작업완료.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		menu();
		System.out.print("작업선택? ");
		int jobNo = sc.nextInt();
		
		switch (jobNo) {
		case 1: baseInput(); break;
		//case 2: baseOutput(); break;
		//case 3: scoreReport(); break;
		//case 4: hno_Inq(); break;
		//case 5: scoreReportSort(); break;
		default: System.out.println("작업을 종료합니다."); break;
		}
	}

}
