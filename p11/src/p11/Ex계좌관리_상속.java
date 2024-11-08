package p11;
import java.util.Scanner;

public class Ex계좌관리_상속 {

	static Account p[] = new Account[10];
	//전역의 파생 객체배열 생성 및 선언
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
		String accid = null;
		boolean sw; // 중복계좌 체크전 초기치
		do
		{
			sw = false;
			System.out.print("계좌번호? ");
			accid = tc.nextLine();
			
			// 중복계좌 체크
			for (int i = 0; i < inx; i++)
			{
				if (p[i].getAccid().equals(accid))
				{
					sw = true;
					System.out.print("\t중복계좌임... 다시 ");
					break;
				}
			} // for
		}
		while (sw);
		
		System.out.print("고객명? ");
		String cusName = tc.nextLine();
		System.out.print("개설금액?");
		long money = sc.nextLong();
		p[inx] = new Account(accid,cusName,money); // 자녀객체 생성
		//p[inx].show();
		//System.out.println("inx : " + inx);
		inx++;
		System.out.println("#계좌개설 작업완료");
	}
	
	static void allInq()
	{
		System.out.println("#전체 계좌조회 작업입니다.");
		
		if(inx == 0)
		{
			System.out.println("\t개설계좌 X....");
		}
		else
		{
			for(int i = 0; i < inx; i++)
			{
				p[i].show();
			}
		}
		
		System.out.println("#전체 계좌조회 작업완료.\n");
	}
	
	static void oneInq()
	{
		System.out.println("#계좌조회 작업입니다.");
		
		if (inx == 0)
		{
			System.out.println("\t개설계좌는 X...#계좌조회 작업불가!");
			return; // 함수의 호출위치로 복귀!
		}
		
		System.out.print("조회 계좌번호? ");
		String accid = tc.nextLine();
		int i = 0;
		boolean sw = false; // 찾기전 초기치 설정
		for (i = 0; i < inx; i++)
		{
			if (p[i].getAccid().equals(accid))
			{
				sw = true;
				break;
			}
		}
		
		if (!sw)
		{
			System.out.println("\t조회계좌는 존재하지 X...#계좌조회 작업완료.\n");
			return;
		}
		else
			p[i].show();			
		System.out.println("#계좌조회 작업완료.\n");
	}
	
	static void deposit()
	{
		System.out.println("#입금 작업입니다.");
		
		if (inx == 0)
		{
			System.out.println("\t개설계좌는 존재하지 X...#입금 작업불가!\n");
			return;
		}
		
		System.out.print("\t입금 계좌번호? ");
		String accid = tc.nextLine();
		System.out.print("\t      입금액? ");
		long money = sc.nextLong();
		
		// 계좌 찾기
		int i;
		boolean sw = false; // 찾기전 초기치 설정
		for (i = 0; i < inx; i++)
		{
			if (p[i].getAccid().equals(accid))
			{
				sw = true;
				break;
			}
		}
		
		if (sw)
		{
			// 입금계좌가 있을때
			p[i].plusMoney(money);
			System.out.println("\t입금후 잔액 : " +p[i].getBalance() + "원");
			System.out.println("#입금 작업완료.\n");
		}

		else 
		{
			// 입금계좌가 없을때
			System.out.println("\t입력한 입금계좌는 존재하지 X...#입금 작업불가!\n");
			return;
		}
		
	}
	
	static void withdraw()
	{
		System.out.println("#출금 작업입니다.");
		
		if (inx == 0)
		{
			System.out.println("\t개설계좌는 존재하지 X...#출금 작업불가!\n");
			return;
		}
		
		System.out.print("\t출금 계좌번호? ");
		String accid = tc.nextLine();
		System.out.print("\t      출금액? ");
		long money = sc.nextLong();
		
		// 계좌 찾기
		int i;
		boolean sw = false; // 찾기전 초기치 설정
		for (i = 0; i < inx; i++)
		{
			if (p[i].getAccid().equals(accid))
			{
				sw = true;
				break;
			}
		}
		
		if (!sw) {
		    // 출금계좌가 없을 때
		    System.out.println("\t입력한 출금계좌는 존재하지 않습니다. #출금 작업 불가!\n");
		    return;
		}
		
		if(p[i].getBalance() == 0)
		{
			// 잔액이 0일때
		    System.out.println("\t잔액이 없습니다.\n");
		    return;
		}

		if (p[i].getBalance() < money)
		{
		    // 잔액이 부족할 때
		    System.out.println("\t잔액이 부족합니다.!\n");
		    while (p[i].getBalance() < money)
		    {
		        System.out.print("\t      출금액? ");
		        money = sc.nextLong();
		    }
		}
		// 출금계좌가 존재하고 잔액이 충분할 때
		p[i].minusMoney(money);
		System.out.println("\t출금 후 잔액 : " + p[i].getBalance() + "원");
		System.out.println("#출금 작업 완료.\n");
	}
	
	
	public static void main(String[] args) {
		
		while(true)
		{
			menu();
			System.out.print("작업선택? ");
			int jobNo=sc.nextInt();
			switch(jobNo)
			{
				case 1:makeAccid();break;
				case 2:deposit();break;
				case 3:withdraw();break;
				case 4:oneInq();break;
				case 5:allInq();break;
				default:
					{
						System.out.println("작업을 종료합니다.");
						return;
					}
			} // switch		
		} // while
	} // main

}
