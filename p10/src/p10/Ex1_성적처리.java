package p10;
import java.util.Scanner;

public class Ex1_성적처리 {
	// static 전역 설정은 sc.close() 를 할 필요가 없음.
	static Scanner sc = new Scanner(System.in); // 숫자
	static Scanner tc = new Scanner(System.in); // 문자열
	static Sungjuk p[] = new Sungjuk[10];
	
	static void menu() {
		System.out.println("\n  -- 메뉴 --");
		System.out.println("1. 기본data 입력");
		System.out.println("2. 기본data 출력");
		System.out.println("3. 성적표 출력");
		System.out.println("4. 번호로 조회");
		System.out.println("5. 성적표 출력(등수순)");
		System.out.println("6. 작업종료");
	}
	
	static void baseInput() {
		System.out.println("#기본data 입력 작업입니다.");
		
		// 사용자 입력
		System.out.print("번호? ");
		int hno = sc.nextInt();
		
		System.out.print("이름? ");
		String name = tc.nextLine();
		
		System.out.print("국어, 영어?? ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		
		// 컨테이너 생성
		p[0] = new Sungjuk(hno, name, kor, eng);
		p[0].disp();
		
		System.out.println("#기본data 입력 작업완료.");
	}
	
	public static void main(String[] args) {
		
		while (true) {
			menu();
			System.out.print("작업선택? ");
			int jobNo = sc.nextInt();
			
			switch (jobNo) {
			case 1: baseInput(); break;
			//case 2: baseOutput(); break;
			//case 3: scoreReport(); break;
			//case 4: hno_Inq(); break;
			//case 5: scoreReportSort(); break;
			default:
				System.out.println("작업을 종료합니다.");
				return;
			} // switch
			
		} // while
		
	} // main()

}
