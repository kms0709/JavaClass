package p8;

public class Account {

	private String accid; //계좌번호
	private String cusName; //고객명
	private long balance; //잔액
	public long getBalance() { return balance; }
	public String getAccid() { return accid; }
	public void plusMoney(long _money) { balance += _money; }
	public void minusMoney(long _money) { balance -= _money; }
	
	public Account(String _accid, String _cusName , long _money)
	{
		accid = _accid;
		cusName = _cusName;
		balance = _money;
		
		System.out.println("생성자\n");
	}
	
	public void show()
	{
		System.out.printf("계좌번호 : %s\t고객명 : %s\t잔액 : %d\n",
				accid , cusName , balance);
	}
}
