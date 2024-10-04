package p6;

public class Panmae
{
	private char code;
	private String pname;
	private int su;
	private int dan;
	private int price;
	
	public void calc()
	{
		this.price = this.su * this.dan; //price = su * dan;
	}
	
	public void Show()
	{
		calc();
		System.out.println("코드 : " + code);
		System.out.println("품명 : " + pname);
		System.out.println("수량 : " + this.su);
		System.out.println("단가 : " + dan);
		System.out.println("금액 : " + price);
	}
	
	public Panmae(char code, String pname ,int su ,int dan)
	{
		//code = code; //매개변수 = 매개변수	
		this.code = code; //멤버변수 = 매개변수
		this.pname = pname;
		this.su = su;
		this.dan = dan;
	}
}
