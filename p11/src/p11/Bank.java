package p11;

public class Bank {
	private String accid; // 계좌번호
	private String cusName; // 고객명
	
	// getter
	public String getAccid() { return accid; }
	public String getCusName() { return cusName; }
	
	// 생성자
	Bank(String accid, String cusName) {
		this.accid = accid;
		this.cusName = cusName;
		
		System.out.println("부모 생성자!!\n");
	}
}

class Account extends Bank {
	private long balance; // 잔액
	
	// getter
	public long getBalance() { return balance; }
	
	// 함수
	public void plusMoney(long _money) { balance += _money; }
	public void minusMoney(long _money) { balance -= _money; }
	
	// 생성자
	public Account(String accid, String cusName , long money) {
		super(accid, cusName);
		balance = money;
		
		System.out.println("자녀 생성자!!\n");
	}
	
	public void show() {
		System.out.printf("계좌번호 : %s\t고객명 : %s\t잔액 : %d\n",
				getAccid(), getCusName(), balance);
	}
}
