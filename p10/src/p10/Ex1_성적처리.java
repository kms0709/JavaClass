package p10;
import java.util.Scanner;

public class Ex1_성적처리 {
	// static 전역 설정은 sc.close() 를 할 필요가 없음.
	static Scanner sc = new Scanner(System.in); // 숫자
	static Scanner tc = new Scanner(System.in); // 문자열
	static Sungjuk p[] = new Sungjuk[10];
	static int inx = 0;
	
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
		boolean sw; int hno;
		// 사용자 입력
		do { 
		System.out.print("번호? ");
		int hno = sc.nextInt();
		sw = false;//중복번호 체크
		for(int i=0;i<inx;i++)
		 {
			if(p[i].getHno() == hno ) {
				sw=true;
				System.out.print("\t중복번호임... 다시");
				break;
			}
		 }
		}while(sw);
		System.out.print("이름? ");
		String name = tc.nextLine();
		
		System.out.print("국어, 영어?? ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		
		// 컨테이너 생성
		p[inx] = new Sungjuk(hno, name, kor, eng);
		p[inx] = new calc();
		rank();
		//p[0].disp();
		// p0, p1, p2 3개 만듬 => inx = 3
		inx++;
		
		System.out.println("#기본data 입력 작업완료.");
	}
	static void rank(){
		//등수구하기
		int soon;
		for(int i=0;i<=inx;i++) {//i를 기준
			soon=1;//비교전 1등
			for(int j=0;j<=inx;j++) {//j가 비교대상
				if(p[i].getTot() <	p[j].getTot()) soon++;//3 <	200
			}
			p[i].setRn(soon);
		}
	}
	
	static void baseOutput() {
		System.out.println("#기본data 출력 작업입니다.");
		
		// 예외처리
		if (inx == 0) {
			System.out.println("\t생석객체X...#기본data 출력 작업불가!!");
			return; // main() 으로 복귀
		}
		
		// 컨테이너 정보 출력
		System.out.println("번호\t이름\t국어\t영어");
		for (int i = 0; i < inx; i++) {
			p[i].disp1();
			System.out.println();
		}
		
		System.out.println("#기본data 출력 작업완료.");
	}
	static void scoreReport() {
		
	}
	
	public static void main(String[] args) {
		
		while (true) {
			menu();
			System.out.print("작업선택? ");
			int jobNo = sc.nextInt();
			
			switch (jobNo) {
			case 1: baseInput(); break;
			case 2: baseOutput(); break;
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