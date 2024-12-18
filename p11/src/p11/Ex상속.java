package p11;/*
--q--
부모이름 : xxx
자녀이름 : xxx
자녀지능 : xxx
*/
public class Ex상속 {
	
	public static void main(String[] args) {
		Child p = new Child();// 파생객체 생성
		Child q = new Child("홍 길 동","홍 아 름",129);
		System.out.println("--p--");
		p.show();
		System.out.println("--q--");
		q.show();
	}
	
}

class Parent{
	private String pName;
	public Parent() {System.out.println("부모의 인수 없는 생성자");}
	public Parent(String pName) {
		this.pName=pName;
		System.out.println("부모의 인수 있는 생성자");
	}
	String getPName(){
		return pName;
	}
}
class Child extends Parent{
	private String cName;
	private int iq;
	public Child(){System.out.println("자녀의 인수없는 생성자");}
	public Child(String pName,String cName,int iq) {
		super(pName);//부모의 인수있는 생성자 명시적 호출
		this.cName=cName;
		this.iq=iq;
		System.out.println("자녀의 인수있는 생성자");
	}
	public void show(){
		System.out.println("부모이름 : "+getPName());
		System.out.println("자녀이름 : "+cName);
		System.out.println("자녀지능 : "+iq);
		
	}
}/*
파생객체 생성시 제어는 자녀생성자로 넘어간후,
부모생성자를 작동호출하여 실행후, 복귀한다음
자녀생성자를 실행*/