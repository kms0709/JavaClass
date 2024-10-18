package p8;

public class Account {

	private String accid; //계좌번호
	private String cusName; //고객명
	private long balance; //잔액
	
	public Account(String _accid, String _cusName , long _money)
	{
		accid = _accid;
		cusName = _cusName;
		balance = _money;
		
		System.out.println("생성자\n");
	}
}
