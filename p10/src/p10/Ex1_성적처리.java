package p10;
import java.util.Scanner;
public class Ex1_성적처리 {
	static Scanner sc=new Scanner(System.in);
	static Scanner tc=new Scanner(System.in);
	static Sungjuk p[]=new Sungjuk[10];
	static int inx=0;
	static void menu(){
		System.out.println("  -- 메뉴 --");System.out.println("1. 기본data 입력");
		System.out.println("2. 기본data 출력");
		System.out.println("3. 성적표 출력");
		System.out.println("4. 번호로 조회");
		System.out.println("5. 성적표 출력(등수순)");
		System.out.println("6. 작업종료");	   
	}
	static void baseInput(){
		System.out.println("#기본data 입력 작업입니다.");
		boolean sw;int hno;
	 do{
			System.out.print("번호? "); hno=sc.nextInt();
			 sw=false;//중복번호 체크전 초기치 
			for(int i=0;i<inx;i++) {
				if(p[i].getHno() == hno ) {
					sw=true;
					System.out.print("\t중복번호임... 다시 ");
					break;
				}
			}//for		
	   }while(sw);
		System.out.print("이름? "); String name=tc.nextLine();
		System.out.print("국어,영어?? "); int kor=sc.nextInt();
		int eng=sc.nextInt();
		p[inx]=new Sungjuk(hno,name,kor,eng);
		p[inx].calc();		//p[0].disp(); p[0],p[1], p[2]
		rank();
		inx++;//3
		System.out.println("#기본data 입력 작업완료.");		
	}
	static void rank(){
		//등수구하기
		int soon;
		for(int i=0;i<=inx;i++) { //i를 기준
			soon=1;//비교전 1등
			for(int j=0;j<=inx;j++) {//j가 비교대상
				if(p[i].getTot() < p[j].getTot() ) soon++;//3 <  200
			}
			p[i].setRn(soon);
		}
	}
	static void baseOutput(){
		System.out.println("#기본data 출력 작업입니다.");
		if(inx==0) {
			System.out.println("\t생성객체X...#기본data 출력 작업불가!\n");
			return;//baseOutput()함수의 호출위치로 복귀
		}
		System.out.println("번호\t이름\t국어\t영어");
		for(int i=0;i<inx;i++) {
			p[i].disp1();
			System.out.println();
		}
		System.out.println("#기본data 출력 작업완료.\n");
	}
	static void scoreReport(){
		System.out.println("#성적표 출력 작업입니다.");
		if(inx==0) {
			System.out.println("\t생성객체X...#성적표 출력 작업불가!\n");
			return;//함수의 호출위치로 복귀
		}		
		System.out.println("번호\t이름\t국어\t영어\t총점\t  평균\t평가\t등수");
		for(int i=0;i<inx;i++) {
			p[i].disp1();
			p[i].disp2();
		}
		System.out.println("#성적표 출력 작업완료.\n");
	}
	static void hno_Inq(){
		System.out.println("#번호로 조회 작업입니다.");
		if(inx==0) {
			System.out.println("\t생성객체X...#번호로 조회 작업불가!\n");
			return;//함수의 호출위치로 복귀
		}	
		System.out.print("조회 번호? ");int hno=sc.nextInt();
		int i;
		boolean sw=false;//찾아보기전 초기치 
		for(i=0;i<inx;i++) {
			if(p[i].getHno()==hno) {
				sw=true;
				break;
			}
		}
		if(!sw) {
			System.out.println("\t조회번호는 X...\n");
			return;
		}
		else {
			System.out.println("번호\t이름\t국어\t영어\t총점\t  평균\t평가\t등수");
			p[i].disp1();
			p[i].disp2();
		}
		System.out.println("#번호로 조회 작업완료.\n");
	}
	static void scoreReportSort(){
		System.out.println("성적표 출력(등수순) 작업입니다.");
		if(inx==0) {
			System.out.println("\t생성객체X...#성적표 출력(등수순) 작업불가!\n");
			return;//함수의 호출위치로 복귀
		}
		//등수로 정렬하기
		Sungjuk temp;
		for(int i=0;i<inx-1;i++) { //i가 기준
			for(int j=i+1;j<inx;j++) {//j가 비교대상
				if(p[i].getRn() >  p[j].getRn()  )//3 >   1
				{//바꾸기 
					temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		System.out.println("번호\t이름\t국어\t영어\t총점\t  평균\t평가\t등수");
		for(int i=0;i<inx;i++) {
			p[i].disp1();
			p[i].disp2();
		}		
		System.out.println("#성적표 출력(등수순) 작업완료.\n");
	}
	public static void main(String[] args) {		
		while(true) {
		menu();
		System.out.print("작업선택? ");int jobNo=sc.nextInt();
		switch(jobNo) {
			case 1: baseInput();break;
			case 2: baseOutput();break;
			case 3: scoreReport();break;
			case 4: hno_Inq();break;
			case 5: scoreReportSort();break;
			default: System.out.println("작업을 종료합니다.");			       
			         return;
		}//switch		
	  }//while 
	}
}
//asd
