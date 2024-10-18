package p8;

import java.util.Scanner;

public class Ex3계좌관리
{
	static Account p[] = new Account[10]; //전역의 객체배열 생성
	static int inx = 0;
	static Scanner sc=new Scanner(System.in);
	static Scanner tc=new Scanner(System.in);
	
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
	
	static void makeAccid()
	{
		System.out.println("#계좌개설 작업입니다.");
		System.out.print("계좌번호? ");
		String accid = tc.nextLine();
		System.out.print("고객명? ");
		String cusName = tc.nextLine();
		System.out.print("개설금액?");
		long money = sc.nextLong();
		p[inx] = new Account(accid,cusName,money);
		//p[inx].show();
		//System.out.println("inx : " + inx);
		inx++;
		System.out.println("#계좌개설 작업완료");
	}
	
	static void allInq()
	{
		System.out.println("#전체 계좌조회 작업입니다.");
		
		for(int i = 0; i < p.length , i++)
		{
			p[i].show();
		}
		
		System.out.println("#전체 계좌조회 작업입니다.");
	}
	
	public static void main(String[] args)
	{

		while(true)
		{
			menu();
			System.out.print("작업선택? ");
			int jobNo=sc.nextInt();
			switch(jobNo)
			{
				case 1:makeAccid();break;
				//case 2:deposit();break;
				//case 3:withdraw();break;
				//case 4:oneInq();break;
				//case 5:allInq();break;
				default:
					{
						System.out.println("작업을 종료합니다.");
						return;
					}
			}		
		}
	}
}
