package p12;
import java.util.Scanner;
public class Ex5_채점표 {
	static Scanner sc=new Scanner(System.in);
	static Scanner tc=new Scanner(System.in);
	static Chaejum p[]=new Chaejum[10];
	static int inx=0;
	static final int SIZE=5;
	static void menu() {
		System.out.println("--메뉴--");
		System.out.println("1.기본데이터입력");
		System.out.println("2.기본데이터출력");
		System.out.println("3.채점표 출력");
		System.out.println("4.번호로 조회");
		System.out.println("5.채점표 출력(등수순)");
		System.out.println("6.작업종료");
	}
	static void bInput() {
		System.out.println("기본데이터 입력 작업입니다");
		boolean sw;int hno;
		do {
		System.out.print("번호?"); hno = sc.nextInt();
		sw=false;//중복번호체크
		for(int i=0;i<inx;i++) {
			if(p[i].getHno() == hno) {
				System.out.print("\t중복번호임..다시");
				sw=true;
				break;
			}
		}
		}while(sw);
		System.out.print("이름?"); String name=tc.nextLine();
		
		int sdap[]=new int[SIZE];
		for(int i=0;i<SIZE;i++) {
			System.out.printf(("\t#%d번?"),i+1);
			sdap[i]=sc.nextInt();
		}
		p[inx]=new Chaejum(hno,name,sdap);//p[0],p[1],p[2]
		inx++; //3
		System.out.println("기본데이터 입력 작업완료.");
		
	}
	static void bOutput() {
		System.out.println("기본데이터 입력 작업입니다");
		if (inx==0) {
			System.out.println("\t입력자료X...#기본데이터 출력 작업불가.");
			return;
		}
		System.out.println("번호\t이름\t#1 #2 #3 #4 #5");
		for(int i=0;i<inx;i++) {
			p[i].showHnoName();
			p[i].showSdap();
		}
		System.out.println("기본데이터 출력 작업완료.");
		
	}

	public static void main(String[] args) {
		while(true) {
			menu();
			System.out.print("작업선택?"); int jobNo=sc.nextInt();
			switch(jobNo) {
				case 1:bInput();break;
				case 2:bOutput();break;
				//case 3:resultReport();break;
				//case 4:nameInq();break;
				//case 5:resultReportSort();break;
				default:System.out.println("작업을 종료합니다."); return;
		}
		
		}

	}

}
