package p8;

import java.util.Scanner;

public class Ex3계좌관리 {
	static void menu()
	{
		System.out.println("--메뉴--");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 조회");
		System.out.println("5. 전체 계좌 조회");
		System.out.println("6. 작업 종료");
	}
	static void makeAccid() {
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		menu();
		System.out.print("작업선택? ");
		int jobNo=sc.nextInt();
		switch(jobNo) {
		case 1:makeAccid();break;
		}
	}

}
